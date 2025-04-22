package org.example.controllers;

import org.example.Entity.primary.ProblemReport;
import org.example.services.ProblemReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/problems")
public class ProblemReportController {

    @Autowired
    private ProblemReportService problemReportService;

    @PostMapping("/submit")
    public ResponseEntity<ProblemReport> submitProblemReport(@RequestBody ProblemReport report) {
        ProblemReport savedReport = problemReportService.submitProblemReport(
                report.getProblemType(),
                report.getDescription(),
                report.getUsername(),
                report.getFullName()
        );
        return ResponseEntity.ok(savedReport);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ProblemReport>> getAllProblemReports() {
        List<ProblemReport> reports = problemReportService.getAllProblemReports();
        return ResponseEntity.ok(reports);
    }
}