package org.example.controllers;

import org.example.Entity.softtravel.SuiviDemande;
import org.example.services.SuiviDemandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/missions")
public class SuiviDemandeController {

    private final SuiviDemandeService suiviDemandeService;

    public SuiviDemandeController(SuiviDemandeService suiviDemandeService) {
        this.suiviDemandeService = suiviDemandeService;
    }

    // Get missions by status
    @GetMapping("/status/{status}")
    public List<SuiviDemande> getMissionsByStatus(@PathVariable String status) {
        return suiviDemandeService.getMissionsByStatus(status);
    }

    // Get past missions for each employee
    @GetMapping("/past")
    public List<SuiviDemande> getPastMissions() {
        return suiviDemandeService.getPastMissions();
    }

    @GetMapping("/manager/employees")
    public List<Map<String, Object>> getEmployeesByManager(
            @RequestParam String nomManager,
            @RequestParam String prenomManager
    ) {
        return suiviDemandeService.getEmployeesByManager(nomManager, prenomManager);
    }
}