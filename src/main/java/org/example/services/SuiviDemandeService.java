package org.example.services;

import org.example.Entity.softtravel.SuiviDemande;
import org.example.Repository.softtravel.SuiviDemandeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SuiviDemandeService {

    private final SuiviDemandeRepository suiviDemandeRepository;

    public SuiviDemandeService(SuiviDemandeRepository suiviDemandeRepository) {
        this.suiviDemandeRepository = suiviDemandeRepository;
    }

    public List<SuiviDemande> getMissionsByStatus(String status) {
        return suiviDemandeRepository.findByEtat(status);
    }

    public List<SuiviDemande> getPastMissions() {
        return suiviDemandeRepository.findPastMissions();
    }

    public List<Map<String, Object>> getEmployeesByManager(String nomManager, String prenomManager) {
        List<Object[]> results = suiviDemandeRepository.findEmployeesByManager(nomManager, prenomManager);
        List<Map<String, Object>> employees = new ArrayList<>();

        for (Object[] row : results) {
            Map<String, Object> record = new HashMap<>();
            record.put("mission_id", row[0]);
            record.put("nom", row[1]);
            record.put("prenom", row[2]);
            record.put("matricule", row[3]);
            record.put("code_direction", row[4]);
            record.put("designation", row[5]);
            record.put("type", row[6]);
            record.put("date_debut_mission", row[7]);
            record.put("date_fin_mission", row[8]);
            record.put("etat", row[9]);
            record.put("total_billet", row[10]);
            record.put("frais_divers", row[11]);
            record.put("status_liquidation", row[12]);
            record.put("nom_manager", row[13]);
            record.put("prenom_manager", row[14]);
            employees.add(record);
        }

        return employees;
    }
}