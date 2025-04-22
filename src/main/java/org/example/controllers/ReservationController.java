package org.example.controllers;

import org.example.dto.ReservationHistoryDTO;
import org.example.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/history")
    public List<ReservationHistoryDTO> getReservationHistoryByName(@RequestParam String participantName) {
        return reservationService.getReservationHistoryByName(participantName);
    }
}