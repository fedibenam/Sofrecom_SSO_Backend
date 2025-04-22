package org.example.Entity.secondary;

import javax.persistence.*;

@Entity
@Table(name = "user_rooms")
public class UserRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "matricule_rh") // Correct column name
    private Users user;

    @ManyToOne
    @JoinColumn(name = "rooms_idroom", referencedColumnName = "idroom")
    private Room room;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}