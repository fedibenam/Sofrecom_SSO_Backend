package org.example.Entity.secondary;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idroom;

    private String name;
    private Long idbuilding;
    private Long idfloor;
    private Long idblock;
    private Integer capacity;
    private String adresse;
    private String telephone;
    private Boolean videoproj;
    private Boolean pontteleph;
    private Boolean visio;
    private String color;

    // Getters and Setters
    public Long getIdroom() {
        return idroom;
    }

    public void setIdroom(Long idroom) {
        this.idroom = idroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdbuilding() {
        return idbuilding;
    }

    public void setIdbuilding(Long idbuilding) {
        this.idbuilding = idbuilding;
    }

    public Long getIdfloor() {
        return idfloor;
    }

    public void setIdfloor(Long idfloor) {
        this.idfloor = idfloor;
    }

    public Long getIdblock() {
        return idblock;
    }

    public void setIdblock(Long idblock) {
        this.idblock = idblock;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getVideoproj() {
        return videoproj;
    }

    public void setVideoproj(Boolean videoproj) {
        this.videoproj = videoproj;
    }

    public Boolean getPontteleph() {
        return pontteleph;
    }

    public void setPontteleph(Boolean pontteleph) {
        this.pontteleph = pontteleph;
    }

    public Boolean getVisio() {
        return visio;
    }

    public void setVisio(Boolean visio) {
        this.visio = visio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}