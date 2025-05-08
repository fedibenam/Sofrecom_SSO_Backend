package org.example.Entity.dep;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "depenses", schema = "deplacementdb")
public class Depenses {

    @Id
    @Column(name = "id_mission") // Maps to the correct column name
    private Long idMission;

    @Column(name = "matricule_collab")
    private String matriculeCollab;

    @Column(name = "prix_depense")
    private Double prixDepense;

    @Column(name = "type_depense")
    private String typeDepense;

    // Getters and Setters
    public Long getIdMission() {
        return idMission;
    }

    public void setIdMission(Long idMission) {
        this.idMission = idMission;
    }

    public String getMatriculeCollab() {
        return matriculeCollab;
    }

    public void setMatriculeCollab(String matriculeCollab) {
        this.matriculeCollab = matriculeCollab;
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