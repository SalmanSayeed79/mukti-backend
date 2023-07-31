package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Education;
import com.mukti.muktibackend.Entity.Video;
import com.mukti.muktibackend.Interface.EducationRepository;
import com.mukti.muktibackend.Interface.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class EducationService {
    @Autowired
    EducationRepository eduRepo;
    @RequestMapping(value="/edu/{id}",method = RequestMethod.GET)
    public List<Education> searchBotById(@PathVariable("id") Long id){
        return eduRepo.getAllEducationbyUser(id);
    }
    @RequestMapping(value="/edu",method= RequestMethod.POST)
    public Education addBot(@RequestBody Education os){
        eduRepo.saveAndFlush(os);
        return os;
    }
}
