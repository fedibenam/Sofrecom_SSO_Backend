package org.example.Repository.secondary;

import org.example.Entity.secondary.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}