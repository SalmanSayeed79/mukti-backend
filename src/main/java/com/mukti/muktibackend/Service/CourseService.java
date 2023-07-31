package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Entity.Course;
import com.mukti.muktibackend.Interface.AlumniRepository;
import com.mukti.muktibackend.Interface.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class CourseService {
    @Autowired
    CourseRepository courseRepo;

    @RequestMapping(value="/courses",method = RequestMethod.GET)
    public List<Course> getBots(){
        return courseRepo.getAllCourses();
    }
    @RequestMapping(value="/course/{id}",method = RequestMethod.GET)
    public Course searchBotById(@PathVariable("id") Long id){
        return courseRepo.searchCourseByID(id);
    }
    @RequestMapping(value="/course",method= RequestMethod.POST)
    public Course addBot(@RequestBody Course course){
        courseRepo.saveAndFlush(course);
        return course;
    }
}
