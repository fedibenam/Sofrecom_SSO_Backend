package org.example.controllers;

import org.example.Entity.secondary.UserRoom;
import org.example.dto.UserReservationDTO;
import org.example.services.UserRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/reservations")
public class UserRoomController {

    @Autowired
    private UserRoomService userRoomService;

    @GetMapping("/reservations")
    public List<UserReservationDTO> getReservationsByUserName(@RequestParam String prenom, @RequestParam String nom) {
        return userRoomService.getReservationsByUserName(prenom, nom);
    }
}