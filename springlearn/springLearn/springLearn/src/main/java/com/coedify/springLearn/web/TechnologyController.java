package com.coedify.springLearn.web;

import com.coedify.springLearn.models.entity.TechnologyEntity;
import com.coedify.springLearn.models.repository.TechnologyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="coedify/springLearn/Technology")
public class TechnologyController {
    @Autowired
    TechnologyRepository technologyRepository;

    @PostMapping("/tech")
    TechnologyEntity printMessage(@RequestBody TechnologyEntity technology){
        return technologyRepository.save(technology);
    }
}
