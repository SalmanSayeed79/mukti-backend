package com.mukti.muktibackend.Service;


import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Interface.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class AlumniService {
    @Autowired
    AlumniRepository alumniRepo;

    @RequestMapping(value="/alumni",method = RequestMethod.GET)
    public List<Alumni> getBots(){
        return alumniRepo.getAllAlumni();
    }
    @RequestMapping(value="/alumni/{id}",method = RequestMethod.GET)
    public List<Alumni> searchBotById(@PathVariable("id") Long id){
        return alumniRepo.searchAlumniByID(id);
    }
    @RequestMapping(value="/alumni",method= RequestMethod.POST)
    public Alumni addBot(@RequestBody Alumni alumni){
        alumniRepo.saveAndFlush(alumni);
        return alumni;
    }
}
