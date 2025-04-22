// UserRoleCombined.java
package org.example.Entity.primary;

import javax.persistence.*;

@Entity
@Table(name = "user_role_combined")
public class UserRoleCombined {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_emp", length = 100)
    private String nomEmp;

    @Column(name = "role_name", length = 255)
    private String roleName;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}