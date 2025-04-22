package org.example.services;

import org.example.Entity.primary.ProblemReport;
import org.example.Repository.primary.ProblemReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProblemReportService {

    @Autowired
    private ProblemReportRepository problemReportRepository;

    public ProblemReport submitProblemReport(String problemType, String description, String username, String fullName) {
        ProblemReport report = new ProblemReport();
        report.setProblemType(problemType);
        report.setDescription(description);
        report.setUsername(username);
        report.setFullName(fullName);
        report.setSubmittedAt(LocalDateTime.now());
        return problemReportRepository.save(report);
    }
    public List<ProblemReport> getAllProblemReports() {
        return problemReportRepository.findAll();
    }
}





