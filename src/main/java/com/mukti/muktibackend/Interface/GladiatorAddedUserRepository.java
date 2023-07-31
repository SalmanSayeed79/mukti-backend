package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Evaluation;
import com.mukti.muktibackend.Entity.GladiatorAddedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GladiatorAddedUserRepository extends JpaRepository<GladiatorAddedUser,Long> {
    @Query(value = "SELECT * FROM  gladiator_added_user a WHERE a.gladiator_id=?1",nativeQuery = true)
    List<GladiatorAddedUser> getAllUsersByGladiator(Long id);



}
