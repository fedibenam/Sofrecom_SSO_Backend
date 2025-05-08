package org.example.services;

import org.example.Entity.sirh.RefFormation;
import org.example.Repository.sirh.RefFormationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Service
public class RefFormationService {

    private final RefFormationRepository refFormationRepository;

    public RefFormationService(RefFormationRepository refFormationRepository) {
        this.refFormationRepository = refFormationRepository;
    }

    public List<RefFormation> getPlannedSessionsForNextMonth() {
        YearMonth nextMonth = YearMonth.now().plusMonths(1);
        LocalDate startDate = nextMonth.atDay(1);
        LocalDate endDate = nextMonth.atEndOfMonth();
        return refFormationRepository.findPlannedSessionsForNextMonth(startDate, endDate);
    }

    public List<RefFormation> getCompletedSessions() {
        return refFormationRepository.findCompletedSessions();
    }

    public List<RefFormation> getTopCompletedSessions(int limit) {
        return refFormationRepository.findTopCompletedSessions(limit);
    }
}