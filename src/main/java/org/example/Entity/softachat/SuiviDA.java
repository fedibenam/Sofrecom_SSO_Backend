package org.example.Entity.softachat;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "suivi_da")
public class SuiviDA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dac_id")
    private Long dacId;

    @Column(name = "daa_id")
    private Long daaId;

    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

    @Column(name = "dac_dat_deb_livraison")
    private LocalDate dacDatDebLivraison;

    @Column(name = "dac_dat_fin_livraison")
    private LocalDate dacDatFinLivraison;

    @Column(name = "code_bon_commande")
    private String codeBonCommande;

    @Column(name = "client")
    private String client;

    @Column(name = "statut")
    private String statut;

    @Column(name = "fournisseur")
    private String fournisseur;

    @Column(name = "devise")
    private String devise;

    @Column(name = "type_payment")
    private String typePayment;

    @Column(name = "nom_demandeur")
    private String nomDemandeur;

    @Column(name = "profil")
    private String profil;

    @OneToMany(mappedBy = "suiviDA", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SuiviFactBC> suiviFactBCs;

    public Long getDacId() {
        return dacId;
    }

    public void setDacId(Long dacId) {
        this.dacId = dacId;
    }

    public Long getDaaId() {
        return daaId;
    }

    public void setDaaId(Long daaId) {
        this.daaId = daaId;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getDacDatDebLivraison() {
        return dacDatDebLivraison;
    }

    public void setDacDatDebLivraison(LocalDate dacDatDebLivraison) {
        this.dacDatDebLivraison = dacDatDebLivraison;
    }

    public LocalDate getDacDatFinLivraison() {
        return dacDatFinLivraison;
    }

    public void setDacDatFinLivraison(LocalDate dacDatFinLivraison) {
        this.dacDatFinLivraison = dacDatFinLivraison;
    }

    public String getCodeBonCommande() {
        return codeBonCommande;
    }

    public void setCodeBonCommande(String codeBonCommande) {
        this.codeBonCommande = codeBonCommande;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public String getNomDemandeur() {
        return nomDemandeur;
    }

    public void setNomDemandeur(String nomDemandeur) {
        this.nomDemandeur = nomDemandeur;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public List<SuiviFactBC> getSuiviFactBCs() {
        return suiviFactBCs;
    }

    public void setSuiviFactBCs(List<SuiviFactBC> suiviFactBCs) {
        this.suiviFactBCs = suiviFactBCs;
    }
// Getters and Setters
    // ...
}