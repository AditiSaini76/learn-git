package com.coedify.springLearn.services.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.coedify.springLearn.commons.converter.RecruiterRequestConverter;
import com.coedify.springLearn.commons.converter.RequestTechConverter;
import com.coedify.springLearn.models.dto.request.RecruiterRequestRequest;
import com.coedify.springLearn.models.dto.response.RecruiterRequestResponse;
import com.coedify.springLearn.models.dto.response.RequestTechResponse;
import com.coedify.springLearn.models.entity.RecruiterRequestEntity;
import com.coedify.springLearn.models.entity.RequestTechEntity;
import com.coedify.springLearn.models.entity.TechnologyEntity;
import com.coedify.springLearn.models.repository.RecruiterRepository;
import com.coedify.springLearn.models.repository.RequestTechRepository;
import com.coedify.springLearn.models.repository.TechnologyRepository;
import com.coedify.springLearn.services.RecruiterRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruiterRequestServiceImpl implements RecruiterRequestService {
    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    TechnologyRepository technologyRepository;

    @Autowired
    RequestTechRepository requestTechRepository;


    
    @Override
    
    public List<TechnologyEntity> getAllTechnologies(){
        return technologyRepository.findAll();
    }

    public RecruiterRequestResponse createARequest(RecruiterRequestRequest request){
        RecruiterRequestResponse response= RecruiterRequestConverter.entityToResponse(recruiterRepository.save(RecruiterRequestConverter.requestToEntity(request)));
        
        request.getTechnologies().forEach(value ->{
            RequestTechEntity entity = new RequestTechEntity();
            entity.setRequestId(response.getId());
            entity.setTechId(value);
            requestTechRepository.save(entity);
        
        });
        return response;
    }
        //return  technology name in response
        public RecruiterRequestResponse techRequest(Long requestId){
           Optional<RecruiterRequestEntity> entity= recruiterRepository.findById(requestId);

           RecruiterRequestResponse response= RecruiterRequestConverter.entityToResponse(entity.get());
           List<RequestTechEntity> requestTech= requestTechRepository.findByRequestId(response.getId());
           List<String> technologies = new LinkedList<>();
            requestTech.forEach(reqTech ->{
                Optional<TechnologyEntity> tEntity = technologyRepository.findById(reqTech.getTechId());
                String techNanme = tEntity.get().getTechStack();
                technologies.add(techNanme);
            });
         
         response.setTechnologies(technologies);
           return response;
        }
         // return technologies id in response
        public RecruiterRequestResponse createRequest(Long requestId){
            Optional<RecruiterRequestEntity> entity= recruiterRepository.findById(requestId);
            RecruiterRequestResponse response= RecruiterRequestConverter.entityToResponse(entity.get());
            List<RequestTechEntity> reqTech= requestTechRepository.findByRequestId(response.getId());
            List<Long> techId1 = new LinkedList<>();
            reqTech.forEach(searchTech ->{
                techId1.add(searchTech.getTechId());
            });
             response.setTechnology(techId1);
            return response;
        }

        public RequestTechResponse technoId(Long requestId){
        List<RequestTechEntity> techEntity=requestTechRepository.findTechId(requestId);
        List<RequestTechResponse> response= RequestTechConverter.entityToResponse(techEntity);
        List<Long> techIds=new LinkedList<>();
        response.forEach(searchTechId ->{
              techIds.add(searchTechId.getTechId());
        });

            return null;
        }
    }
