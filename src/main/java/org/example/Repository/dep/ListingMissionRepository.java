package org.example.Repository.dep;

import org.example.Entity.dep.ListingMission;
import org.example.dto.MissionDetailsDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ListingMissionRepository extends JpaRepository<ListingMission, Long> {

    @Query("""
    SELECT new org.example.dto.MissionDetailsDTO(
        m.idMission, m.codeStatus, m.dateDebut, m.dateFin, m.destination,
        m.transportAller, m.transportRetour, m.firstName, m.lastName,
        m.matriculeCollab, m.codeBu, COALESCE(d.prixDepense, 0), d.typeDepense
    )
    FROM ListingMission m
    LEFT JOIN Depenses d
        ON m.idMission = d.idMission
        AND m.matriculeCollab = d.matriculeCollab
    WHERE m.firstName = :firstName AND m.lastName = :lastName
""")
    List<MissionDetailsDTO> findMissionDetailsByCollaborator(
            @Param("firstName") String firstName,
            @Param("lastName") String lastName
    );
}