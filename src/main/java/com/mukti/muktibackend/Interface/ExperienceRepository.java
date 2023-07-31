package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Evaluation;
import com.mukti.muktibackend.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
    @Query(value = "SELECT * FROM  experience a WHERE a.user_id=?1",nativeQuery = true)
    List<Experience> getAllExperienceByUser(Long id);
}
