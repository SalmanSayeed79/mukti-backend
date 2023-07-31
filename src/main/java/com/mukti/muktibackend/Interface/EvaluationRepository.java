package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Evaluation;
import com.mukti.muktibackend.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EvaluationRepository extends JpaRepository<Evaluation,Long> {
    @Query(value = "SELECT * FROM  evaluation",nativeQuery = true)
    List<Evaluation> getAllEvaluations();

    @Query(value = "SELECT * FROM  evaluation a WHERE a.course_id=?1",nativeQuery = true)
    List<Evaluation> getAllEvaluationsByCourse(Long courseId);
}
