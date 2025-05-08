package org.example.Repository.softtravel;

import org.example.Entity.softtravel.SuiviDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuiviDemandeRepository extends JpaRepository<SuiviDemande, Long> {

    // Fetch missions by status
    List<SuiviDemande> findByEtat(String etat);

    // Fetch past missions for each employee
    @Query("SELECT s FROM SuiviDemande s WHERE s.dateFinMission < CURRENT_DATE ORDER BY s.matricule, s.dateFinMission DESC")
    List<SuiviDemande> findPastMissions();

    @Query(value = """
        SELECT
            mission_id,
            nom,
            prenom,
            matricule,
            code_direction,
            designation,
            type,
            date_debut_mission,
            date_fin_mission,
            etat,
            total_billet,
            frais_divers,
            status_liquidation,
            nom_manager,
            prenom_manager
        FROM
            suivi_demande
        WHERE
            nom_manager = :nomManager
            AND prenom_manager = :prenomManager
        ORDER BY
            date_debut_mission DESC
    """, nativeQuery = true)
    List<Object[]> findEmployeesByManager(
            @Param("nomManager") String nomManager,
            @Param("prenomManager") String prenomManager
    );
}
