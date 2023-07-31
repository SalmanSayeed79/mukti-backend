package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Evaluation;
import com.mukti.muktibackend.Entity.OfflineSession;
import com.mukti.muktibackend.Interface.EvaluationRepository;
import com.mukti.muktibackend.Interface.OfflineSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class EvaluationService {
    @Autowired
    EvaluationRepository evalRepo;
    @RequestMapping(value="/evals",method = RequestMethod.GET)
    public List<Evaluation> getBots(){
        return evalRepo.getAllEvaluations();
    }
    @RequestMapping(value="/eval/{id}",method = RequestMethod.GET)
    public List<Evaluation> searchBotById(@PathVariable("id") Long id){
        return evalRepo.getAllEvaluationsByCourse(id);
    }
    @RequestMapping(value="/eval",method= RequestMethod.POST)
    public Evaluation addBot(@RequestBody Evaluation evaleval){
        evalRepo.saveAndFlush(evaleval);
        return evaleval;
    }
}
