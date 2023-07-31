package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Education;
import com.mukti.muktibackend.Entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education,Long> {
    @Query(value = "SELECT * FROM  education a WHERE a.user_id=?1",nativeQuery = true)
    List<Education> getAllEducationbyUser(Long id);
}
