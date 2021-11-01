package com.coedify.springLearn.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coedify.springLearn.modals.entity.RecruiterRequestEntity;
import com.coedify.springLearn.modals.repository.RecuriterRepository;

@RestController
@RequestMapping(value ="coedify/springLearn")
public class RecuriterRequestController {
     
    @Autowired
    RecuriterRepository RecuriterRepository;
    
    @PostMapping("/print")
    RecruiterRequestEntity printMessage(@RequestBody RecruiterRequestEntity request)
    {
        
        return RecuriterRepository.save(request);

    }

    @GetMapping("/print/{value}")
    String printMessages(@PathVariable Integer value){
        return "You are in print " +value;
    }
}
