package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.CourseUser;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseUserRepository extends JpaRepository<CourseUser,Long> {
    @Query(value = "SELECT * FROM  course_user a WHERE a.user_id=?1",nativeQuery = true)
    List<CourseUser> getAllCoursesByUser(Long id);

    @Transactional
    @Modifying
    @Query(value="UPDATE course_user SET status=:status,completed=:completed  WHERE user_id= :id AND course_id=:cid",nativeQuery = true)
    int updateUser(Long id,Long cid, String status, Boolean completed);
}
