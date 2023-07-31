package com.mukti.muktibackend.Interface;


import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Entity.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FAQRepository extends JpaRepository<FAQ,Long> {
    @Query(value = "SELECT * FROM  faq",nativeQuery = true)
    List<FAQ> getAllFAQ();

    @Query(value = "SELECT * FROM  faq a WHERE a.course_id=?1",nativeQuery = true)
    List<FAQ> getAllFAQByCourse(Long courseId);


}
