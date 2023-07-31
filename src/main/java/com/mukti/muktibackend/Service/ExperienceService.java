package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Experience;
import com.mukti.muktibackend.Interface.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class ExperienceService {
    @Autowired
    ExperienceRepository expRepo;
    @RequestMapping(value="/exp/{id}",method = RequestMethod.GET)
    public List<Experience> searchBotById(@PathVariable("id") Long id){
        return expRepo.getAllExperienceByUser(id);
    }
    @RequestMapping(value="/exp",method= RequestMethod.POST)
    public Experience addBot(@RequestBody Experience os){
        expRepo.saveAndFlush(os);
        return os;
    }
}
