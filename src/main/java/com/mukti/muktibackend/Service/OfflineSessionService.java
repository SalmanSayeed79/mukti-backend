package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.FAQ;
import com.mukti.muktibackend.Entity.OfflineSession;
import com.mukti.muktibackend.Interface.FAQRepository;
import com.mukti.muktibackend.Interface.OfflineSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class OfflineSessionService {
    @Autowired
    OfflineSessionRepository osRepo;
    @RequestMapping(value="/os",method = RequestMethod.GET)
    public List<OfflineSession> getBots(){
        return osRepo.getAllOS();
    }
    @RequestMapping(value="/os/{id}",method = RequestMethod.GET)
    public List<OfflineSession> searchBotById(@PathVariable("id") Long id){
        return osRepo.getAllOSByCourse(id);
    }
    @RequestMapping(value="/os",method= RequestMethod.POST)
    public OfflineSession addBot(@RequestBody OfflineSession os){
        osRepo.saveAndFlush(os);
        return os;
    }
}
