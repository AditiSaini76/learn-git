package com.coedify.springLearn.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value ="coedify/springLearn")
public class RecuriterRequestController {
    
    @GetMapping("/")
    String printMessage()
    {
       return "hello";

    }

    @GetMapping("/print/{value}")
    String printMessages(@PathVariable Integer value){
        return "You are in print " +value;
    }
}
