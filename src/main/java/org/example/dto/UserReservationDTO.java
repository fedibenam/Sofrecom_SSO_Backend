package org.example.dto;

public class UserReservationDTO {
    private String prenom;
    private String nom;
    private String email;
    private String roomName;
    private Integer capacity;
    private String telephone;
    private Boolean videoproj;
    private Boolean pontteleph;
    private Boolean visio;

    // Constructor
    public UserReservationDTO(String prenom, String nom, String email, String roomName, Integer capacity, String telephone, Boolean videoproj, Boolean pontteleph, Boolean visio) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.roomName = roomName;
        this.capacity = capacity;
        this.telephone = telephone;
        this.videoproj = videoproj;
        this.pontteleph = pontteleph;
        this.visio = visio;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setVideoproj(Boolean videoproj) {
        this.videoproj = videoproj;
    }

    public void setPontteleph(Boolean pontteleph) {
        this.pontteleph = pontteleph;
    }

    public void setVisio(Boolean visio) {
        this.visio = visio;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getRoomName() {
        return roomName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public String getTelephone() {
        return telephone;
    }

    public Boolean getVideoproj() {
        return videoproj;
    }

    public Boolean getPontteleph() {
        return pontteleph;
    }

    public Boolean getVisio() {
        return visio;
    }
// Getters and Setters
    // (Omitted for brevity)
}