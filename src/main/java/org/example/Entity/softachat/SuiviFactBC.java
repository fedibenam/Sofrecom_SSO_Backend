package org.example.Entity.softachat;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "suivi_fact_bc")
public class SuiviFactBC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_fact")
    private String codeFact;

    @Column(name = "code_num")
    private String codeNum;

    @Column(name = "date_creation_fact")
    private LocalDateTime dateCreationFact;

    @Column(name = "nom_createur_fact")
    private String nomCreateurFact;

    @Column(name = "prix_fact")
    private Double prixFact;

    @Column(name = "prix_fact_ttc")
    private Double prixFactTtc;

    @Column(name = "satut_fact")
    private String statutFact;

    @Column(name = "code_bc")
    private String codeBC;

    @Column(name = "date_create_bc")
    private LocalDateTime dateCreateBC;

    @Column(name = "prix_bc")
    private Double prixBC;

    @Column(name = "statut_bc")
    private String statutBC;

    @Column(name = "devise")
    private String devise;

    @Column(name = "nom_createur_bc")
    private String nomCreateurBC;

    @ManyToOne
    @JoinColumn(name = "dac_id", nullable = false)
    private SuiviDA suiviDA;

    // Getters and Setters

    public String getCodeFact() {
        return codeFact;
    }

    public void setCodeFact(String codeFact) {
        this.codeFact = codeFact;
    }

    public String getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(String codeNum) {
        this.codeNum = codeNum;
    }

    public LocalDateTime getDateCreationFact() {
        return dateCreationFact;
    }

    public void setDateCreationFact(LocalDateTime dateCreationFact) {
        this.dateCreationFact = dateCreationFact;
    }

    public String getNomCreateurFact() {
        return nomCreateurFact;
    }

    public void setNomCreateurFact(String nomCreateurFact) {
        this.nomCreateurFact = nomCreateurFact;
    }

    public Double getPrixFact() {
        return prixFact;
    }

    public void setPrixFact(Double prixFact) {
        this.prixFact = prixFact;
    }

    public Double getPrixFactTtc() {
        return prixFactTtc;
    }

    public void setPrixFactTtc(Double prixFactTtc) {
        this.prixFactTtc = prixFactTtc;
    }

    public String getStatutFact() {
        return statutFact;
    }

    public void setStatutFact(String statutFact) {
        this.statutFact = statutFact;
    }

    public String getCodeBC() {
        return codeBC;
    }

    public void setCodeBC(String codeBC) {
        this.codeBC = codeBC;
    }

    public LocalDateTime getDateCreateBC() {
        return dateCreateBC;
    }

    public void setDateCreateBC(LocalDateTime dateCreateBC) {
        this.dateCreateBC = dateCreateBC;
    }

    public Double getPrixBC() {
        return prixBC;
    }

    public void setPrixBC(Double prixBC) {
        this.prixBC = prixBC;
    }

    public String getStatutBC() {
        return statutBC;
    }

    public void setStatutBC(String statutBC) {
        this.statutBC = statutBC;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getNomCreateurBC() {
        return nomCreateurBC;
    }

    public void setNomCreateurBC(String nomCreateurBC) {
        this.nomCreateurBC = nomCreateurBC;
    }

    public SuiviDA getSuiviDA() {
        return suiviDA;
    }

    public void setSuiviDA(SuiviDA suiviDA) {
        this.suiviDA = suiviDA;
    }
    // ...
}