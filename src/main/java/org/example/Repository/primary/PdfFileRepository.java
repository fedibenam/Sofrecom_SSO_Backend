package org.example.Repository.primary;

import org.example.Entity.primary.PdfFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PdfFileRepository extends JpaRepository<PdfFile, Long> {
    Optional<PdfFile> findTopByOrderByIdDesc();
}