package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.FAQ;
import com.mukti.muktibackend.Entity.OfflineSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfflineSessionRepository extends JpaRepository<OfflineSession,Long> {

    @Query(value = "SELECT * FROM  offline_session",nativeQuery = true)
    List<OfflineSession> getAllOS();

    @Query(value = "SELECT * FROM  offline_session a WHERE a.course_id=?1",nativeQuery = true)
    List<OfflineSession> getAllOSByCourse(Long courseId);

}
