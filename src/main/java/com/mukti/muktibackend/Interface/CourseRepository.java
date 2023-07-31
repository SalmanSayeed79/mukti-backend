package com.mukti.muktibackend.Interface;


import com.mukti.muktibackend.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    @Query(value = "SELECT * FROM  course",nativeQuery = true)
    List<Course> getAllCourses();

    @Query(value = "SELECT * FROM  course a  WHERE a.bot_id = ?1",nativeQuery = true)
    Course searchCourseByID(Long id);
}
