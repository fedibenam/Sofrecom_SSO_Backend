package org.example.controllers;

import org.example.Entity.sirh.RefFormation;
import org.example.services.RefFormationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
public class RefFormationController {

    private final RefFormationService refFormationService;

    public RefFormationController(RefFormationService refFormationService) {
        this.refFormationService = refFormationService;
    }

    @GetMapping("/api/formations/planned/next-month")
    public List<RefFormation> getPlannedSessionsForNextMonth() {
        return refFormationService.getPlannedSessionsForNextMonth();
    }

    @GetMapping("/api/formations/completed")
    public List<RefFormation> getCompletedSessions() {
        return refFormationService.getCompletedSessions();
    }

    @GetMapping("/api/formations/completed/top")
    public List<RefFormation> getTopCompletedSessions(@RequestParam int limit) {
        return refFormationService.getTopCompletedSessions(limit);
    }
}