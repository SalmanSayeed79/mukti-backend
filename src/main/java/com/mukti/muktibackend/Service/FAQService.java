package com.mukti.muktibackend.Service;

import com.mukti.muktibackend.Entity.Alumni;
import com.mukti.muktibackend.Entity.FAQ;
import com.mukti.muktibackend.Interface.AlumniRepository;
import com.mukti.muktibackend.Interface.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class FAQService {
    @Autowired
    FAQRepository faqRepo;
    @RequestMapping(value="/faqs",method = RequestMethod.GET)
    public List<FAQ> getBots(){
        return faqRepo.getAllFAQ();
    }
    @RequestMapping(value="/faq/{id}",method = RequestMethod.GET)
    public List<FAQ> searchBotById(@PathVariable("id") Long id){
        return faqRepo.getAllFAQByCourse(id);
    }
    @RequestMapping(value="/faq",method= RequestMethod.POST)
    public FAQ addBot(@RequestBody FAQ faq){
        faqRepo.saveAndFlush(faq);
        return faq;
    }
}
