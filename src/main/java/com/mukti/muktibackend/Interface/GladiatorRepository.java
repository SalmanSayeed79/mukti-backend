package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Evaluation;
import com.mukti.muktibackend.Entity.Gladiator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GladiatorRepository extends JpaRepository<Gladiator,Long> {
    @Query(value = "SELECT * FROM  gladiator",nativeQuery = true)
    List<Gladiator> getAllGladiators();

    @Query(value = "SELECT * FROM  gladiator a WHERE a.course_id=?1",nativeQuery = true)
    List<Gladiator> getGladiatorsByCourse(Long courseId);

    @Query(value = "SELECT * FROM  gladiator a WHERE a.user_id=?1",nativeQuery = true)
    Gladiator getGladiatorsByUserId(Long id);
}
