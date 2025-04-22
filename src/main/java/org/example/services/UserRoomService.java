package org.example.services;

import org.example.Entity.secondary.UserRoom;
import org.example.Repository.secondary.UserRoomRepository;
import org.example.dto.UserReservationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoomService {

    @Autowired
    private UserRoomRepository userRoomRepository;

    public List<UserReservationDTO> getReservationsByUserName(String prenom, String nom) {
        return userRoomRepository.findReservationsByUserName(prenom, nom);
    }
}