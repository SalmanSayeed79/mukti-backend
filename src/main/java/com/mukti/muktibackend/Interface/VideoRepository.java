package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.OfflineSession;
import com.mukti.muktibackend.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video,Long> {
    @Query(value = "SELECT * FROM  video",nativeQuery = true)
    List<Video> getAllVideos();

    @Query(value = "SELECT * FROM  video a WHERE a.course_id=?1",nativeQuery = true)
    List<Video> getAllVideosByCourse(Long courseId);
}
