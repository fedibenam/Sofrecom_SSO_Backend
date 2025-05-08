package org.example.Entity.sirh;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
@Table(name = "ref_conge", schema = "public")
public class RefConge {

    @Id
    @Column(name = "matricule")
    private String matricule;

    @Column(name = "collaborateur")
    private String collaborateur;

    @Column(name = "motif")
    private String motif;

    @Column(name = "date_debut")
    private LocalDate dateDebut;

    @Column(name = "date_fin")
    private LocalDate dateFin;

    // Getters and Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(String collaborateur) {
        this.collaborateur = collaborateur;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}