package com.coedify.springLearn.commons.converter;

import java.util.Objects;
import com.coedify.springLearn.models.dto.request.RecruiterRequestRequest;
import com.coedify.springLearn.models.dto.response.RecruiterRequestResponse;
import com.coedify.springLearn.models.entity.RecruiterRequestEntity;

import com.coedify.springLearn.models.pojo.RecruiterRequestPojo;


public class RecruiterRequestConverter {
   
    public static RecruiterRequestEntity pojoToEntity (RecruiterRequestPojo request){
    RecruiterRequestEntity entity = new RecruiterRequestEntity();
    if(Objects.isNull(request))
    return null;
    entity.setCompanyName(request.getCompanyName());
    entity.setEmail(request.getEmail());
    entity.setDuration(request.getDuration());
    entity.setExperience(request.getExperience());
    entity.setId(request.getId());
    entity.setMobileNumber(request.getMobileNumber());
    entity.setName(request.getName());
    entity.setResourseStrength(request.getResourseStrength());
    entity.setTechStack1(request.getTechStack1());
    entity.setTechStack2(request.getTechStack2());
    

    return entity;
    }
    public static RecruiterRequestResponse entityToResponse (RecruiterRequestEntity recruiterRequestEntity){
        RecruiterRequestResponse response2 =new RecruiterRequestResponse();
         if(Objects.isNull(recruiterRequestEntity))
         return null;
         response2.setCompanyName(recruiterRequestEntity.getCompanyName());
         response2.setEmail(recruiterRequestEntity.getEmail());
         response2.setDuration(recruiterRequestEntity.getDuration());
         response2.setExperience(recruiterRequestEntity.getExperience());
         response2.setId(recruiterRequestEntity.getId());
         response2.setMobileNumber(recruiterRequestEntity.getMobileNumber());
         response2.setName(recruiterRequestEntity.getName());
         response2.setResourseStrength(recruiterRequestEntity.getResourseStrength());
         response2.setTechStack1(recruiterRequestEntity.getTechStack1());
         response2.setTechStack2(recruiterRequestEntity.getTechStack2());
         
     return response2;
    }
    public static RecruiterRequestEntity requestToEntity (RecruiterRequestRequest request1){
        RecruiterRequestEntity request2 =new RecruiterRequestEntity();
        if(Objects.isNull(request1))
        return null;
        request2.setCompanyName(request1.getCompanyName());
        request2.setEmail(request1.getEmail());
        request2.setDuration(request1.getDuration());
        request2.setExperience(request1.getExperience());
        request2.setId(request1.getId());
        request2.setMobileNumber(request1.getMobileNumber());
        request2.setName(request1.getName());
        request2.setResourseStrength(request1.getResourseStrength());
        request2.setTechStack1(request1.getTechStack1());
        request2.setTechStack2(request1.getTechStack2());

        return request2;
    }
    
    
    
}
