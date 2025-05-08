package org.example.dto;

import java.time.LocalDateTime;

public class MissionDetailsDTO {

    private Long idMission;
    private String codeStatus;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String destination;
    private String transportAller;
    private String transportRetour;
    private String firstName;
    private String lastName;
    private String matriculeCollab;
    private String codeBu;
    private Double prixDepense;
    private String typeDepense;

    public MissionDetailsDTO(Long idMission, String codeStatus, LocalDateTime dateDebut, LocalDateTime dateFin,
                             String destination, String transportAller, String transportRetour, String firstName,
                             String lastName, String matriculeCollab, String codeBu, Double prixDepense, String typeDepense) {
        this.idMission = idMission;
        this.codeStatus = codeStatus;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.destination = destination;
        this.transportAller = transportAller;
        this.transportRetour = transportRetour;
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculeCollab = matriculeCollab;
        this.codeBu = codeBu;
        this.prixDepense = prixDepense;
        this.typeDepense = typeDepense;
    }

    // Getters and Setters
    public Long getIdMission() {
        return idMission;
    }

    public void setIdMission(Long idMission) {
        this.idMission = idMission;
    }

    public String getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(String codeStatus) {
        this.codeStatus = codeStatus;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTransportAller() {
        return transportAller;
    }

    public void setTransportAller(String transportAller) {
        this.transportAller = transportAller;
    }

    public String getTransportRetour() {
        return transportRetour;
    }

    public void setTransportRetour(String transportRetour) {
        this.transportRetour = transportRetour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatriculeCollab() {
        return matriculeCollab;
    }

    public void setMatriculeCollab(String matriculeCollab) {
        this.matriculeCollab = matriculeCollab;
    }

    public String getCodeBu() {
        return codeBu;
    }

    public void setCodeBu(String codeBu) {
        this.codeBu = codeBu;
    }

    public Double getPrixDepense() {
        return prixDepense;
    }

    public void setPrixDepense(Double prixDepense) {
        this.prixDepense = prixDepense;
    }

    public String getTypeDepense() {
        return typeDepense;
    }

    public void setTypeDepense(String typeDepense) {
        this.typeDepense = typeDepense;
    }
}