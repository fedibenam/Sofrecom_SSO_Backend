package org.example.Repository.secondary;

import org.example.Entity.secondary.UserRoom;
import org.example.dto.UserReservationDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoomRepository extends JpaRepository<UserRoom, Long> {

    @Query("SELECT new org.example.dto.UserReservationDTO(u.prenom, u.nom, u.email, r.name, r.capacity, r.telephone, r.videoproj, r.pontteleph, r.visio) " +
            "FROM UserRoom ur " +
            "JOIN ur.user u " +
            "JOIN ur.room r " +
            "WHERE u.prenom = :prenom AND u.nom = :nom " +
            "ORDER BY r.idroom DESC")
    List<UserReservationDTO> findReservationsByUserName(@Param("prenom") String prenom, @Param("nom") String nom);
}