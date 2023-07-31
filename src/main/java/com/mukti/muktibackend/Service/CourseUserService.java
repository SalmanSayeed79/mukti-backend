package com.mukti.muktibackend.Service;


import com.mukti.muktibackend.Entity.CourseUser;
import com.mukti.muktibackend.Entity.Evaluation;
import com.mukti.muktibackend.Interface.CourseUserRepository;
import com.mukti.muktibackend.Interface.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class CourseUserService {
    @Autowired
    CourseUserRepository cuRepo;


    @RequestMapping(value="/cu/{id}",method = RequestMethod.GET)
    public List<CourseUser> searchBotById(@PathVariable("id") Long id){
        return cuRepo.getAllCoursesByUser(id);
    }
    @RequestMapping(value="/cu",method= RequestMethod.POST)
    public CourseUser addBot(@RequestBody CourseUser evaleval){
        cuRepo.saveAndFlush(evaleval);
        return evaleval;
    }
    @RequestMapping(value="/cu/{id}",method= RequestMethod.PUT)
    public int updateUser(@PathVariable("id") long id,@RequestBody CourseUser cu) {
        try{
            cuRepo.updateUser(
                    cu.getUser_id(),
                    cu.getCourse_id(),
                    cu.getStatus(),
                    cu.getCompleted()
            );
            return 1;
        }
        catch (EmptyResultDataAccessException e){
            return 0;
        }
    }
}
