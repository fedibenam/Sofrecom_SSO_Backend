package org.example.Repository;

import org.example.Entity.MetabaseUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetabaseUserModelRepository extends JpaRepository<MetabaseUserModel, Integer> {
    MetabaseUserModel findByNomEmp(String nomEmp);
}