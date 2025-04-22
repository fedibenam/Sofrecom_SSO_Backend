package org.example.controllers;

import org.example.Entity.primary.ImageEntity;
import org.example.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(
            @RequestParam("file") MultipartFile file,
            @RequestParam("description") String description) {
        try {
            imageService.saveImage(file, description);
            return ResponseEntity.status(HttpStatus.CREATED).body("Image uploaded successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload image");
        }
    }

    @GetMapping("/today")
    public ResponseEntity<?> getLatestImage() {
        Optional<ImageEntity> imageOptional = imageService.getLatestImageUploadedInLast12Hours();
        if (imageOptional.isPresent()) {
            ImageEntity image = imageOptional.get();
            return ResponseEntity.ok().body(Map.of(
                    "description", image.getDescription(),
                    "image", image.getData(),
                    "type", image.getType()
            ));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No image found");
        }
    }
}