package org.example.Repository.primary;

import org.example.Entity.primary.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity, Long> {

    @Query("SELECT i FROM ImageEntity i WHERE i.uploadDate > :cutoff ORDER BY i.uploadDate DESC")
    List<ImageEntity> findImagesUploadedAfter(LocalDateTime cutoff);

}
