package org.example.Repository.secondary;

import org.example.Entity.secondary.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("secondaryUserRepository")
public interface UserRepository extends JpaRepository<Users, Long> {
}