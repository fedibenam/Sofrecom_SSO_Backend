package org.example.controllers;

import org.example.Entity.sirh.RefConge;
import org.example.services.RefCongeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
public class RefCongeController {

    private final RefCongeService refCongeService;

    public RefCongeController(RefCongeService refCongeService) {
        this.refCongeService = refCongeService;
    }

    @GetMapping("/api/conges")
    public List<RefConge> getCongesByCollaborateur(@RequestParam String collaborateur) {
        return refCongeService.getCongesByCollaborateur(collaborateur);
    }
}