package org.example.services;

import org.example.dto.ReservationHistoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    // Inject the secondary JdbcTemplate (for MySQL)
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public List<ReservationHistoryDTO> getReservationHistoryByName(String participantName) {
        String sql = """
            SELECT
                p.idparticipant AS idParticipant,
                p.name AS participantName,
                p.mail AS participantEmail,
                p.intern,
                p.obligatoire,
                r.idreservation AS idReservation,
                r.title AS reservationTitle,
                r.description,
                r.color,
                r.typeres AS typeRes,
                r.visibilitytyperes AS visibilityTypeRes,
                r.reservedby AS reservedBy,
                r.room,
                rm.name AS roomName, -- Added room name
                r.simple,
                r.daily,
                r.weekly,
                r.monthly,
                r.yearly,
                r.startdate AS startDate,
                r.starttime AS startTime,
                r.enddate AS endDate,
                r.endtime AS endTime,
                r.allday AS allDay,
                r.frequency,
                r.reccurence_number AS recurrenceNumber,
                r.stateres AS stateRes,
                r.dayofweek AS dayOfWeek,
                r.dayofmonth AS dayOfMonth,
                r.equipments,
                r.descp,
                r.numberpart AS numberPart,
                r.uidmail
            FROM participant p
            JOIN reservation r ON p.reservationid = r.idreservation
            LEFT JOIN room rm ON r.room = rm.idroom -- Added LEFT JOIN
            WHERE p.name = ? -- Parameterized participant name
            ORDER BY p.idparticipant, r.startdate, r.starttime
            LIMIT 0, 25 -- Added LIMIT clause
        """;

        return jdbcTemplate.query(sql, new Object[]{participantName}, (rs, rowNum) -> new ReservationHistoryDTO(
                rs.getInt("idParticipant"),
                rs.getString("participantName"),
                rs.getString("participantEmail"),
                rs.getBoolean("intern"),
                rs.getBoolean("obligatoire"),
                rs.getInt("idReservation"),
                rs.getString("reservationTitle"),
                rs.getString("description"),
                rs.getString("color"),
                rs.getInt("typeRes"),
                rs.getInt("visibilityTypeRes"),
                rs.getInt("reservedBy"),
                rs.getInt("room"),
                rs.getString("roomName"), // Added room name mapping
                rs.getBoolean("simple"),
                rs.getBoolean("daily"),
                rs.getBoolean("weekly"),
                rs.getBoolean("monthly"),
                rs.getBoolean("yearly"),
                rs.getDate("startDate").toString(),
                rs.getTime("startTime").toString(),
                rs.getDate("endDate").toString(),
                rs.getTime("endTime").toString(),
                rs.getBoolean("allDay"),
                rs.getInt("frequency"),
                rs.getInt("recurrenceNumber"),
                rs.getBoolean("stateRes"),
                rs.getBoolean("dayOfWeek"),
                rs.getBoolean("dayOfMonth"),
                rs.getBoolean("equipments"),
                rs.getString("descp"),
                rs.getInt("numberPart"),
                rs.getString("uidMail")
        ));
    }}