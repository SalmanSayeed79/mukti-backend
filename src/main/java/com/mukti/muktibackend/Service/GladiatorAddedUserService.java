package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.GladiatorAddedUser;
import com.mukti.muktibackend.Entity.Video;
import com.mukti.muktibackend.Interface.GladiatorAddedUserRepository;
import com.mukti.muktibackend.Interface.GladiatorRepository;
import com.mukti.muktibackend.Interface.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class GladiatorAddedUserService {
    @Autowired
    GladiatorAddedUserRepository gauRepo;
    @RequestMapping(value="/gau/{id}",method = RequestMethod.GET)
    public List<GladiatorAddedUser> searchBotById(@PathVariable("id") Long id){
        return gauRepo.getAllUsersByGladiator(id);
    }

    @RequestMapping(value="/gau",method= RequestMethod.POST)
    public GladiatorAddedUser addBot(@RequestBody GladiatorAddedUser os){
        gauRepo.saveAndFlush(os);
        return os;
    }
}
