package org.example.services;


import org.example.Entity.sirh.RefConge;
import org.example.Repository.sirh.RefCongeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefCongeService {

    private final RefCongeRepository refCongeRepository;

    public RefCongeService(RefCongeRepository refCongeRepository) {
        this.refCongeRepository = refCongeRepository;
    }

    public List<RefConge> getCongesByCollaborateur(String collaborateur) {
        return refCongeRepository.findByCollaborateur(collaborateur);
    }
}