package org.example.services;

import org.example.Repository.softachat.SuiviDARepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SuiviDAService {

    private final SuiviDARepository suiviDARepository;

    public SuiviDAService(SuiviDARepository suiviDARepository) {
        this.suiviDARepository = suiviDARepository;
    }

    public List<Map<String, Object>> getDemandesByNomDemandeur(String nomDemandeur) {
        return suiviDARepository.findByNomDemandeur(nomDemandeur);
    }
}