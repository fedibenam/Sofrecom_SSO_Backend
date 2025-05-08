package org.example.controllers;

import org.example.services.SuiviDAService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/softachat")
public class SuiviDAController {

    private final SuiviDAService suiviDAService;

    public SuiviDAController(SuiviDAService suiviDAService) {
        this.suiviDAService = suiviDAService;
    }

    @GetMapping("/demandes")
    public List<Map<String, Object>> getDemandesByNomDemandeur(@RequestParam String nomDemandeur) {
        return suiviDAService.getDemandesByNomDemandeur(nomDemandeur);
    }
}