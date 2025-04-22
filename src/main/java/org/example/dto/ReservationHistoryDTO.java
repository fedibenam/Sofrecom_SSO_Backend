package org.example.dto;

public class ReservationHistoryDTO {
    private Integer idParticipant;
    private String participantName;
    private String participantEmail;
    private Boolean intern;
    private Boolean obligatoire;
    private Integer idReservation;
    private String reservationTitle;
    private String description;
    private String color;
    private Integer typeRes;
    private Integer visibilityTypeRes;
    private Integer reservedBy;
    private Integer room;
    private String roomName; // New field
    private Boolean simple;
    private Boolean daily;
    private Boolean weekly;
    private Boolean monthly;
    private Boolean yearly;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private Boolean allDay;
    private Integer frequency;
    private Integer recurrenceNumber;
    private Boolean stateRes;
    private Boolean dayOfWeek;
    private Boolean dayOfMonth;
    private Boolean equipments;
    private String descp;
    private Integer numberPart;
    private String uidMail;

    public ReservationHistoryDTO(Integer idParticipant, String participantName, String participantEmail, Boolean intern, Boolean obligatoire, Integer idReservation, String reservationTitle, String description, String color, Integer typeRes, Integer visibilityTypeRes, Integer reservedBy, Integer room, String roomName, Boolean simple, Boolean daily, Boolean weekly, Boolean monthly, Boolean yearly, String startDate, String startTime, String endDate, String endTime, Boolean allDay, Integer frequency, Integer recurrenceNumber, Boolean stateRes, Boolean dayOfWeek, Boolean dayOfMonth, Boolean equipments, String descp, Integer numberPart, String uidMail) {
        this.idParticipant = idParticipant;
        this.participantName = participantName;
        this.participantEmail = participantEmail;
        this.intern = intern;
        this.obligatoire = obligatoire;
        this.idReservation = idReservation;
        this.reservationTitle = reservationTitle;
        this.description = description;
        this.color = color;
        this.typeRes = typeRes;
        this.visibilityTypeRes = visibilityTypeRes;
        this.reservedBy = reservedBy;
        this.room = room;
        this.roomName = roomName; // Assign value
        this.simple = simple;
        this.daily = daily;
        this.weekly = weekly;
        this.monthly = monthly;
        this.yearly = yearly;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.allDay = allDay;
        this.frequency = frequency;
        this.recurrenceNumber = recurrenceNumber;
        this.stateRes = stateRes;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = dayOfMonth;
        this.equipments = equipments;
        this.descp = descp;
        this.numberPart = numberPart;
        this.uidMail = uidMail;
    }


// Getters and Setters

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getIdParticipant() {
        return idParticipant;
    }

    public String getParticipantName() {
        return participantName;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public Boolean getIntern() {
        return intern;
    }

    public Boolean getObligatoire() {
        return obligatoire;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public String getReservationTitle() {
        return reservationTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public Integer getTypeRes() {
        return typeRes;
    }

    public Integer getVisibilityTypeRes() {
        return visibilityTypeRes;
    }

    public Integer getReservedBy() {
        return reservedBy;
    }

    public Integer getRoom() {
        return room;
    }

    public Boolean getSimple() {
        return simple;
    }

    public Boolean getDaily() {
        return daily;
    }

    public Boolean getWeekly() {
        return weekly;
    }

    public Boolean getMonthly() {
        return monthly;
    }

    public Boolean getYearly() {
        return yearly;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public Integer getRecurrenceNumber() {
        return recurrenceNumber;
    }

    public Boolean getStateRes() {
        return stateRes;
    }

    public Boolean getDayOfWeek() {
        return dayOfWeek;
    }

    public Boolean getDayOfMonth() {
        return dayOfMonth;
    }

    public Boolean getEquipments() {
        return equipments;
    }

    public String getDescp() {
        return descp;
    }

    public Integer getNumberPart() {
        return numberPart;
    }

    public String getUidMail() {
        return uidMail;
    }

    public void setIdParticipant(Integer idParticipant) {
        this.idParticipant = idParticipant;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public void setIntern(Boolean intern) {
        this.intern = intern;
    }

    public void setObligatoire(Boolean obligatoire) {
        this.obligatoire = obligatoire;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public void setReservationTitle(String reservationTitle) {
        this.reservationTitle = reservationTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTypeRes(Integer typeRes) {
        this.typeRes = typeRes;
    }

    public void setVisibilityTypeRes(Integer visibilityTypeRes) {
        this.visibilityTypeRes = visibilityTypeRes;
    }

    public void setReservedBy(Integer reservedBy) {
        this.reservedBy = reservedBy;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public void setSimple(Boolean simple) {
        this.simple = simple;
    }

    public void setDaily(Boolean daily) {
        this.daily = daily;
    }

    public void setWeekly(Boolean weekly) {
        this.weekly = weekly;
    }

    public void setMonthly(Boolean monthly) {
        this.monthly = monthly;
    }

    public void setYearly(Boolean yearly) {
        this.yearly = yearly;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public void setRecurrenceNumber(Integer recurrenceNumber) {
        this.recurrenceNumber = recurrenceNumber;
    }

    public void setStateRes(Boolean stateRes) {
        this.stateRes = stateRes;
    }

    public void setDayOfWeek(Boolean dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDayOfMonth(Boolean dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public void setEquipments(Boolean equipments) {
        this.equipments = equipments;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public void setNumberPart(Integer numberPart) {
        this.numberPart = numberPart;
    }

    public void setUidMail(String uidMail) {
        this.uidMail = uidMail;
    }
    // (Omitted for brevity)
}