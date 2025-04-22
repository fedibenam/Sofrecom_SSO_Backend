package org.example.controllers;

import org.example.Entity.primary.PdfFile;
import org.example.services.PdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/pdfs")
public class PdfFileController {

    @Autowired
    private PdfFileService pdfFileService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadPdf(@RequestParam("file") MultipartFile file) {
        try {
            PdfFile savedFile = pdfFileService.savePdfFile(file);
            return ResponseEntity.ok("PDF uploaded successfully with ID: " + savedFile.getId());
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Failed to upload PDF: " + e.getMessage());
        }
    }

    @GetMapping("/last")
    public ResponseEntity<byte[]> getLastPdf() {
        System.out.println("Request received for /last endpoint");
        PdfFile pdfFile = pdfFileService.getLastPdfFile();
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + pdfFile.getFileName() + "\"")
                .body(pdfFile.getData());
    }
}