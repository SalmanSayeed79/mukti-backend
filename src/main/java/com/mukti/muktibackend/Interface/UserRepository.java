package com.mukti.muktibackend.Interface;


import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM  mukti_user",nativeQuery = true)
    List<User> getAllUsers();
    @Query(value = "SELECT * FROM  mukti_user a  WHERE   a.user_id = ?1",nativeQuery = true)
    User searchUserById(Long id);

    @Query(value = "SELECT * FROM  mukti_user a  WHERE   a.email = ?1",nativeQuery = true)
    User searchUserByemail(String email);
}
