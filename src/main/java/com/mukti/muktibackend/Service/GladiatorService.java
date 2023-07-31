package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Gladiator;
import com.mukti.muktibackend.Entity.Video;
import com.mukti.muktibackend.Interface.GladiatorRepository;
import com.mukti.muktibackend.Interface.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class GladiatorService {
    @Autowired
    GladiatorRepository gladiatorRepo;

    @RequestMapping(value="/gladiator",method = RequestMethod.GET)
    public List<Gladiator> getBots(){
        return gladiatorRepo.getAllGladiators();
    }
    @RequestMapping(value="/gladiator/{id}",method = RequestMethod.GET)
    public List<Gladiator> searchBotById(@PathVariable("id") Long id){
        return gladiatorRepo.getGladiatorsByCourse(id);
    }
    @RequestMapping(value="/gladiator/user/{id}",method = RequestMethod.GET)
    public Gladiator searchBotById1(@PathVariable("id") Long id){
        return gladiatorRepo.getGladiatorsByUserId(id);
    }
    @RequestMapping(value="/gladiator",method= RequestMethod.POST)
    public Gladiator addBot(@RequestBody Gladiator os){
        gladiatorRepo.saveAndFlush(os);
        return os;
    }
}
