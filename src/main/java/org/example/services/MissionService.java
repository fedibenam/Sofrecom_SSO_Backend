package org.example.services;

import org.example.Repository.dep.ListingMissionRepository;
import org.example.dto.MissionDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService {

    private final ListingMissionRepository listingMissionRepository;

    public MissionService(ListingMissionRepository listingMissionRepository) {
        this.listingMissionRepository = listingMissionRepository;
    }

    public List<MissionDetailsDTO> getMissionDetails(String firstName, String lastName) {
        return listingMissionRepository.findMissionDetailsByCollaborator(firstName, lastName);
    }
}