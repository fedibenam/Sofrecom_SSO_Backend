package org.example.services;


import org.example.Entity.primary.ImageEntity;
import org.example.Repository.primary.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public ImageEntity saveImage(MultipartFile file, String description) throws IOException {
        if (file == null || file.isEmpty() || description == null || description.isBlank()) {
            throw new IllegalArgumentException("File or description is invalid.");
        }

        ImageEntity image = new ImageEntity();

        // Assigning metadata
        String originalFilename = file.getOriginalFilename();
        String contentType = file.getContentType();
        byte[] imageData = file.getBytes();

        if (originalFilename == null || contentType == null || imageData.length == 0) {
            throw new IllegalArgumentException("File metadata or content is invalid.");
        }

        image.setName(originalFilename);
        image.setType(contentType);
        image.setData(imageData);
        image.setUploadDate(LocalDateTime.now());
        image.setDescription(description);

        return imageRepository.save(image);
    }


    public Optional<ImageEntity> getLatestImageUploadedInLast12Hours() {
        LocalDateTime cutoff = LocalDateTime.now().minusHours(12);
        System.out.println("Cutoff time: " + cutoff);
        List<ImageEntity> images = imageRepository.findImagesUploadedAfter(cutoff);
        for (ImageEntity img : images) {
            System.out.println("Found image: " + img.getName() + " at " + img.getUploadDate());
        }

        return images.isEmpty() ? Optional.empty() : Optional.of(images.get(0));
    }

}