package com.mukti.muktibackend.Interface;

import com.mukti.muktibackend.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    @Query(value = "SELECT * FROM  company",nativeQuery = true)
    List<Company> getAllCompanies();



}
