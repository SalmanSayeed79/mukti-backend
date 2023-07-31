package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Alumni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AlumniRepository extends JpaRepository<Alumni,Long> {
    @Query(value = "SELECT * FROM  alumni",nativeQuery = true)
    List<Alumni> getAllAlumni();

    @Query(value = "SELECT * FROM  alumni a WHERE a.course_id=?1",nativeQuery = true)
    List<Alumni> getAllAlumniByCourse(Long courseId);

    @Query(value = "SELECT * FROM  alumni a  WHERE   a.course_id = ?1",nativeQuery = true)
    List<Alumni> searchAlumniByID(Long id);


}
