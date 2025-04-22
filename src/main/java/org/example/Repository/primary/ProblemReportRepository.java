package org.example.Repository.primary;

import org.example.Entity.primary.ProblemReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemReportRepository extends JpaRepository<ProblemReport, Long> {
}