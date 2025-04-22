package org.example.Entity.secondary;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Matches the auto_increment property
    @Column(name = "matricule_rh", nullable = false)
    private Integer matriculeRh; // Correctly maps to the primary key column

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    // Getters and Setters
    public Integer getMatriculeRh() {
        return matriculeRh;
    }

    public void setMatriculeRh(Integer matriculeRh) {
        this.matriculeRh = matriculeRh;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}