package org.example.controllers;

import org.example.dto.MissionDetailsDTO;
import org.example.services.MissionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
public class MissionController {

    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping("/api/missions")
    public List<MissionDetailsDTO> getMissionDetails(
            @RequestParam String firstName,
            @RequestParam String lastName) {
        return missionService.getMissionDetails(firstName, lastName);
    }
}