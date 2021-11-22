package com.coedify.springLearn.web;
import java.util.List;

import javax.validation.Valid;

import com.coedify.springLearn.commons.converter.RecruiterRequestConverter;
import com.coedify.springLearn.models.dto.request.RecruiterRequestRequest;
import com.coedify.springLearn.models.dto.response.RecruiterRequestResponse;
import com.coedify.springLearn.models.dto.response.RequestTechResponse;
import com.coedify.springLearn.models.entity.RecruiterRequestEntity;
import com.coedify.springLearn.models.entity.TechnologyEntity;
import com.coedify.springLearn.models.pojo.RecruiterRequestPojo;
//import com.coedify.springLearn.models.pojo.RecruiterRequestPojo;
import com.coedify.springLearn.models.repository.RecruiterRepository;
import com.coedify.springLearn.services.RecruiterRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="coedify/springLearn")
public class RecuriterRequestController {
     
    @Autowired
    RecruiterRepository recuriterRepository;
    @Autowired
    RecruiterRequestService recruiterRequestService;
    
    @PostMapping("/print")
    RecruiterRequestEntity printMessage(@RequestBody RecruiterRequestEntity  request)
    { 
        return recuriterRepository.save(request);

    }
    
    @GetMapping("/print/{id}")
    RecruiterRequestEntity getEntity(@PathVariable  Long id)
    {
        return recuriterRepository.findById(id).get();
    }

    @PostMapping("/print/get")
       List<RecruiterRequestEntity> gEntity(@RequestBody String mobileNumber)
    {
        return recuriterRepository.findByMobileNumber(mobileNumber);

    }
    @PostMapping("/print/pojoToEntity")
    RecruiterRequestEntity pojoToEntity (@RequestBody @Valid RecruiterRequestPojo request){
        return recuriterRepository.save(RecruiterRequestConverter.pojoToEntity(request));
  }

    @PostMapping("/print/requestToEntity")
    RecruiterRequestResponse requestToEntity(@RequestBody @Valid RecruiterRequestRequest request)
    {
        return recruiterRequestService.createARequest(request);
    }

    @PostMapping("/print/pNumber")
    List<RecruiterRequestEntity> pNumber(@RequestBody String pNumber)
    {
        return recuriterRepository.findByPNumber(pNumber);
    }

    @GetMapping("/print/technologies")
    List<TechnologyEntity> technologies(){
        return recruiterRequestService.getAllTechnologies();
    }
    
    @GetMapping("/responseWithTechName/{requestId}")
    RecruiterRequestResponse responseWithTechName(@PathVariable Long requestId){
        return recruiterRequestService.techRequest(requestId);
    }
   @GetMapping("/responseWithTechId/{requestId}")
   RecruiterRequestResponse responseWithTechId(@PathVariable Long requestId){
       return recruiterRequestService.createRequest(requestId);
   }
   @GetMapping("/getTechId/{requestId}")
   RequestTechResponse getTechId(@PathVariable Long requestId){
       return recruiterRequestService.technoId(requestId);
   }
   
  
   

}
