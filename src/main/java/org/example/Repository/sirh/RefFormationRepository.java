package org.example.Repository.sirh;

import org.example.Entity.sirh.RefFormation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RefFormationRepository extends JpaRepository<RefFormation, String> {

    @Query("""
    SELECT r
    FROM RefFormation r
    WHERE r.etatSession = 'Planifiée'
      AND r.dateSession BETWEEN :startDate AND :endDate
    ORDER BY r.dateSession DESC
""")
    List<RefFormation> findPlannedSessionsForNextMonth(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    @Query("""
        SELECT r
        FROM RefFormation r
        WHERE r.etatSession = 'Réalisée'
        ORDER BY r.dateSession DESC
    """)
    List<RefFormation> findCompletedSessions();

    @Query("""
        SELECT r
        FROM RefFormation r
        WHERE r.etatSession = 'Réalisée'
        ORDER BY r.dateSession DESC
    """)
    List<RefFormation> findTopCompletedSessions(@Param("limit") int limit);
}