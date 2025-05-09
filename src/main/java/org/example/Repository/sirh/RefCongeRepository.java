package org.example.Repository.sirh;

import org.example.Entity.sirh.RefConge;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface RefCongeRepository extends JpaRepository<RefConge, String> {

    @Query("""
    SELECT DISTINCT r 
    FROM RefConge r 
    WHERE TRIM(LOWER(r.collaborateur)) LIKE TRIM(LOWER(:collaborateur))
    ORDER BY r.dateDebut DESC   
""")
    List<RefConge> findByCollaborateur(@Param("collaborateur") String collaborateur);
    }
