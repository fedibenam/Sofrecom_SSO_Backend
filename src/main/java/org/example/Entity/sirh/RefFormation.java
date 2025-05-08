package org.example.Entity.sirh;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
@Table(name = "ref_formation", schema = "public")
public class RefFormation {

    @Id
    @Column(name = "matricule")
    private String matricule;

    @Column(name = "libelle_session")
    private String libelleSession;

    @Column(name = "date_session")
    private LocalDate dateSession;

    @Column(name = "nom_prenom")
    private String nomPrenom;

    @Column(name = "manager")
    private String manager;

    @Column(name = "directeur")
    private String directeur;

    @Column(name = "direction")
    private String direction;

    @Column(name = "libelle_stage")
    private String libelleStage;

    @Column(name = "nb_jours")
    private Double nbJours;

    @Column(name = "etat_session")
    private String etatSession;

    @Column(name = "int_ext")
    private String intExt;

    @Column(name = "organisme")
    private String organisme;

    @Column(name = "domaine")
    private String domaine;

    // Getters and Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getLibelleSession() {
        return libelleSession;
    }

    public void setLibelleSession(String libelleSession) {
        this.libelleSession = libelleSession;
    }

    public LocalDate getDateSession() {
        return dateSession;
    }

    public void setDateSession(LocalDate dateSession) {
        this.dateSession = dateSession;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDirecteur() {
        return directeur;
    }

    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLibelleStage() {
        return libelleStage;
    }

    public void setLibelleStage(String libelleStage) {
        this.libelleStage = libelleStage;
    }

    public Double getNbJours() {
        return nbJours;
    }

    public void setNbJours(Double nbJours) {
        this.nbJours = nbJours;
    }

    public String getEtatSession() {
        return etatSession;
    }

    public void setEtatSession(String etatSession) {
        this.etatSession = etatSession;
    }

    public String getIntExt() {
        return intExt;
    }

    public void setIntExt(String intExt) {
        this.intExt = intExt;
    }

    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
}