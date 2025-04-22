package org.example.Entity.primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "metabase_usermodel")
public class MetabaseUserModel {
    @Id
    private Integer id;

    @Column(name = "mat_emp")
    private String matEmp;

    @Column(name = "cuid_emp")
    private String cuidEmp;

    @Column(name = "genre")
    private String genre;

    @Column(name = "nom_emp")
    private String nomEmp;

    @Column(name = "date_embauche")
    private String dateEmbauche;

    @Column(name = "date_sortie")
    private String dateSortie;

    @Column(name = "id_dept")
    private String idDept;

    @Column(name = "nom_dept")
    private String nomDept;

    @Column(name = "matricul_resp")
    private String matriculResp;

    @Column(name = "nom_resp")
    private String nomResp;

    @Column(name = "id_dept_parent")
    private String idDeptParent;

    @Column(name = "nom_dept_parent")
    private String nomDeptParent;

    @Column(name = "name_bu")
    private String nameBu;

    @Column(name = "name_direction")
    private String nameDirection;

    @Column(name = "resp_bu")
    private String respBu;

    @Column(name = "mail")
    private String mail;



    @Column(name = "nb_exp")
    private String nbExp;

    @Column(name = "seniorite")
    private String seniorite;

    @Column(name = "rue")
    private String rue;

    @Column(name = "rue2")
    private String rue2;

    @Column(name = "region")
    private String region;

    @Column(name = "pays")
    private String pays;

    @Column(name = "position")
    private String position;

    @Column(name = "tot_conge")
    private Integer totConge;

    @Column(name = "conge_maladie")
    private Integer congeMaladie;

    @Column(name = "presence")
    private String presence;

    @Column(name = "groupe")
    private String groupe;

    @Column(name = "fonction")
    private String fonction;

    @Column(name = "domiciles")
    private String domiciles;

    @Column(name = "ranks1")
    private String ranks1;

    @Column(name = "ranks2")
    private String ranks2;

    @Column(name = "prenom")
    private String prenom;

    public Integer getId() {
        return id;
    }

    public String getMatEmp() {
        return matEmp;
    }

    public String getCuidEmp() {
        return cuidEmp;
    }

    public String getGenre() {
        return genre;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public String getIdDept() {
        return idDept;
    }

    public String getNomDept() {
        return nomDept;
    }

    public String getMatriculResp() {
        return matriculResp;
    }

    public String getNomResp() {
        return nomResp;
    }

    public String getIdDeptParent() {
        return idDeptParent;
    }

    public String getNomDeptParent() {
        return nomDeptParent;
    }

    public String getNameBu() {
        return nameBu;
    }

    public String getNameDirection() {
        return nameDirection;
    }

    public String getRespBu() {
        return respBu;
    }

    public String getNbExp() {
        return nbExp;
    }

    public String getSeniorite() {
        return seniorite;
    }

    public String getRue() {
        return rue;
    }

    public String getRue2() {
        return rue2;
    }

    public String getRegion() {
        return region;
    }

    public String getPays() {
        return pays;
    }

    public String getPosition() {
        return position;
    }

    public Integer getTotConge() {
        return totConge;
    }

    public Integer getCongeMaladie() {
        return congeMaladie;
    }

    public String getPresence() {
        return presence;
    }

    public String getGroupe() {
        return groupe;
    }

    public String getFonction() {
        return fonction;
    }

    public String getDomiciles() {
        return domiciles;
    }

    public String getRanks1() {
        return ranks1;
    }

    public String getRanks2() {
        return ranks2;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDirection() {
        return codeDirection;
    }

    public String getDateNai() {
        return dateNai;
    }

    public String getLibelleDirection() {
        return libelleDirection;
    }

    public String getLdapPath() {
        return ldapPath;
    }

    public String getEngaged() {
        return engaged;
    }

    public String getStatus() {
        return status;
    }

    public String getTakesBus() {
        return takesBus;
    }

    public String getCircuit() {
        return circuit;
    }

    public String getStation() {
        return station;
    }

    public String getAutValidation() {
        return autValidation;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public String getDemissionaire() {
        return demissionaire;
    }

    public String getAlternant() {
        return alternant;
    }

    public String getDateNotification() {
        return dateNotification;
    }

    @Column(name = "nom")
    private String nom;

    @Column(name = "code_direction")
    private String codeDirection;

    @Column(name = "date_nai")
    private String dateNai;

    @Column(name = "libelle_direction")
    private String libelleDirection;

    @Column(name = "ldap_path")
    private String ldapPath;

    @Column(name = "engaged")
    private String engaged;

    @Column(name = "status")
    private String status;

    @Column(name = "takes_bus")
    private String takesBus;

    @Column(name = "circuit")
    private String circuit;

    @Column(name = "station")
    private String station;

    @Column(name = "aut_validation")
    private String autValidation;

    @Column(name = "etablissement")
    private String etablissement;

    @Column(name = "demissionaire")
    private String demissionaire;

    @Column(name = "alternant")
    private String alternant;

    @Column(name = "date_notification")
    private String dateNotification;

    // Getters and Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMatEmp(String matEmp) {
        this.matEmp = matEmp;
    }

    public void setCuidEmp(String cuidEmp) {
        this.cuidEmp = cuidEmp;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public void setIdDept(String idDept) {
        this.idDept = idDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public void setMatriculResp(String matriculResp) {
        this.matriculResp = matriculResp;
    }

    public void setNomResp(String nomResp) {
        this.nomResp = nomResp;
    }

    public void setIdDeptParent(String idDeptParent) {
        this.idDeptParent = idDeptParent;
    }

    public void setNomDeptParent(String nomDeptParent) {
        this.nomDeptParent = nomDeptParent;
    }

    public void setNameBu(String nameBu) {
        this.nameBu = nameBu;
    }

    public void setNameDirection(String nameDirection) {
        this.nameDirection = nameDirection;
    }

    public void setRespBu(String respBu) {
        this.respBu = respBu;
    }

    public void setNbExp(String nbExp) {
        this.nbExp = nbExp;
    }

    public void setSeniorite(String seniorite) {
        this.seniorite = seniorite;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setRue2(String rue2) {
        this.rue2 = rue2;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTotConge(Integer totConge) {
        this.totConge = totConge;
    }

    public void setCongeMaladie(Integer congeMaladie) {
        this.congeMaladie = congeMaladie;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setDomiciles(String domiciles) {
        this.domiciles = domiciles;
    }

    public void setRanks1(String ranks1) {
        this.ranks1 = ranks1;
    }

    public void setRanks2(String ranks2) {
        this.ranks2 = ranks2;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodeDirection(String codeDirection) {
        this.codeDirection = codeDirection;
    }

    public void setDateNai(String dateNai) {
        this.dateNai = dateNai;
    }

    public void setLibelleDirection(String libelleDirection) {
        this.libelleDirection = libelleDirection;
    }

    public void setLdapPath(String ldapPath) {
        this.ldapPath = ldapPath;
    }

    public void setEngaged(String engaged) {
        this.engaged = engaged;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTakesBus(String takesBus) {
        this.takesBus = takesBus;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setAutValidation(String autValidation) {
        this.autValidation = autValidation;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public void setDemissionaire(String demissionaire) {
        this.demissionaire = demissionaire;
    }

    public void setAlternant(String alternant) {
        this.alternant = alternant;
    }

    public void setDateNotification(String dateNotification) {
        this.dateNotification = dateNotification;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
