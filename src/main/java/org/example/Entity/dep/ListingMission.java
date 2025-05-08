package org.example.Entity.dep;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "listing_mission", schema = "deplacementdb")
public class ListingMission {

    @Id
    @Column(name = "id_mission") // Maps to the correct column name
    private Long idMission;

    @Column(name = "code_status")
    private String codeStatus;

    @Column(name = "date_debut")
    private LocalDateTime dateDebut;

    @Column(name = "date_fin")
    private LocalDateTime dateFin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "transport_aller")
    private String transportAller;

    @Column(name = "transport_retour")
    private String transportRetour;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "matricule_collab")
    private String matriculeCollab;

    @Column(name = "code_bu")
    private String codeBu;

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
}