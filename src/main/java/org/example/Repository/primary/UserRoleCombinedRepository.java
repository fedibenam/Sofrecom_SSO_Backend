package org.example.Repository.primary;

import org.example.Entity.primary.UserRoleCombined;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleCombinedRepository extends JpaRepository<UserRoleCombined, Long> {

    @Query(value = "SELECT urc.role_name FROM user_role_combined urc WHERE urc.nom_emp = :nomEmp LIMIT 1", nativeQuery = true)
    String findRoleByNomEmp(@Param("nomEmp") String nomEmp);

}