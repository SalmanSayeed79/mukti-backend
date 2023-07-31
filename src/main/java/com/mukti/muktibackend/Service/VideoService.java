package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.OfflineSession;
import com.mukti.muktibackend.Entity.Video;
import com.mukti.muktibackend.Interface.OfflineSessionRepository;
import com.mukti.muktibackend.Interface.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class VideoService {
    @Autowired
    VideoRepository videoRepo;
    @RequestMapping(value="/videos",method = RequestMethod.GET)
    public List<Video> getBots(){
        return videoRepo.getAllVideos();
    }
    @RequestMapping(value="/video/{id}",method = RequestMethod.GET)
    public List<Video> searchBotById(@PathVariable("id") Long id){
        return videoRepo.getAllVideosByCourse(id);
    }
    @RequestMapping(value="/video",method= RequestMethod.POST)
    public Video addBot(@RequestBody Video os){
        videoRepo.saveAndFlush(os);
        return os;
    }
}
