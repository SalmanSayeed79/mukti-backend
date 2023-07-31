package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Entity.Company;
import com.mukti.muktibackend.Interface.AlumniRepository;
import com.mukti.muktibackend.Interface.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class CompanyService {
    @Autowired
    CompanyRepository companyRepo;

    @RequestMapping(value="/company",method = RequestMethod.GET)
    public List<Company> getBots(){
        return companyRepo.getAllCompanies();
    }

    @RequestMapping(value="/company",method= RequestMethod.POST)
    public Company addBot(@RequestBody Company comp){
        companyRepo.saveAndFlush(comp);
        return comp;
    }
}
