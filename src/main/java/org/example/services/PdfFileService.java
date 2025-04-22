package org.example.services;

import org.example.Entity.primary.PdfFile;
import org.example.Repository.primary.PdfFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PdfFileService {

    @Autowired
    private PdfFileRepository pdfFileRepository;

    public PdfFile savePdfFile(MultipartFile file) throws IOException {
        PdfFile pdfFile = new PdfFile();
        pdfFile.setFileName(file.getOriginalFilename());
        pdfFile.setData(file.getBytes());
        return pdfFileRepository.save(pdfFile);
    }

    public PdfFile getLastPdfFile() {
        return pdfFileRepository.findTopByOrderByIdDesc()
                .orElseThrow(() -> new RuntimeException("No PDFs found"));
    }
}