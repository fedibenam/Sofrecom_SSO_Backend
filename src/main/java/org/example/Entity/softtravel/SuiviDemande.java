package org.example.Entity.softtravel;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "suivi_demande")
public class SuiviDemande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mission_id") // Correctly map the column name
    private Long missionId;

    @Column(name = "etat")
    private String etat;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "code_direction")
    private String codeDirection;

    @Column(name = "designation")
    private String designation;

    @Column(name = "type")
    private String type;

    @Column(name = "date_debut_mission")
    private LocalDate dateDebutMission;

    @Column(name = "date_fin_mission")
    private LocalDate dateFinMission;

    @Column(name = "matricule_manager")
    private String matriculeManager;

    @Column(name = "nom_manager")
    private String nomManager;

    @Column(name = "prenom_manager")
    private String prenomManager;

    @Column(name = "perdiem_per_day")
    private String perdiemPerDay;

    @Column(name = "nb_jour_sejour")
    private String nbJourSejour;

    @Column(name = "total_billet")
    private String totalBillet;

    public Long getMissionId() {
        return missionId;
    }

    public String getEtat() {
        return etat;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getCodeDirection() {
        return codeDirection;
    }

    public String getDesignation() {
        return designation;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDateDebutMission() {
        return dateDebutMission;
    }

    public LocalDate getDateFinMission() {
        return dateFinMission;
    }

    public String getMatriculeManager() {
        return matriculeManager;
    }

    public String getNomManager() {
        return nomManager;
    }

    public String getPrenomManager() {
        return prenomManager;
    }

    public String getPerdiemPerDay() {
        return perdiemPerDay;
    }

    public String getNbJourSejour() {
        return nbJourSejour;
    }

    public String getTotalBillet() {
        return totalBillet;
    }

    public String getFraisDivers() {
        return fraisDivers;
    }

    public String getStatusLiquidation() {
        return statusLiquidation;
    }

    @Column(name = "frais_divers")
    private String fraisDivers;

    @Column(name = "status_liquidation")
    private String statusLiquidation;

    // Getters and Setters

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setCodeDirection(String codeDirection) {
        this.codeDirection = codeDirection;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDateDebutMission(LocalDate dateDebutMission) {
        this.dateDebutMission = dateDebutMission;
    }

    public void setDateFinMission(LocalDate dateFinMission) {
        this.dateFinMission = dateFinMission;
    }

    public void setMatriculeManager(String matriculeManager) {
        this.matriculeManager = matriculeManager;
    }

    public void setNomManager(String nomManager) {
        this.nomManager = nomManager;
    }

    public void setPrenomManager(String prenomManager) {
        this.prenomManager = prenomManager;
    }

    public void setPerdiemPerDay(String perdiemPerDay) {
        this.perdiemPerDay = perdiemPerDay;
    }

    public void setNbJourSejour(String nbJourSejour) {
        this.nbJourSejour = nbJourSejour;
    }

    public void setTotalBillet(String totalBillet) {
        this.totalBillet = totalBillet;
    }

    public void setFraisDivers(String fraisDivers) {
        this.fraisDivers = fraisDivers;
    }

    public void setStatusLiquidation(String statusLiquidation) {
        this.statusLiquidation = statusLiquidation;
    }
}