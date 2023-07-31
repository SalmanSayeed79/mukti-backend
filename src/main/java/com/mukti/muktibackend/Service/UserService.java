package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Entity.User;
import com.mukti.muktibackend.Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class UserService {
    @Autowired
    UserRepository userRepo;

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public List<User> getBots(){
        return userRepo.getAllUsers();
    }
    @RequestMapping(value="/user/{email}",method = RequestMethod.GET)
    public User searchBotByEmail(@PathVariable("email") String email){
        return userRepo.searchUserByemail(email);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*" )
    @RequestMapping(value="/userid/{id}",method = RequestMethod.GET)
    public User searchBotById(@PathVariable("id") Long id){
        return userRepo.searchUserById(id);
    }
    @RequestMapping(value="/user",method= RequestMethod.POST)
    public User addBot(@RequestBody User user){
        userRepo.saveAndFlush(user);
        return user;
    }
}
