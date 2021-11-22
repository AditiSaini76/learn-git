package com.coedify.springLearn.services;

import java.util.List;

import com.coedify.springLearn.models.dto.request.RecruiterRequestRequest;
import com.coedify.springLearn.models.dto.response.RecruiterRequestResponse;
import com.coedify.springLearn.models.dto.response.RequestTechResponse;
import com.coedify.springLearn.models.entity.TechnologyEntity;

public interface RecruiterRequestService {
    RecruiterRequestResponse createARequest(RecruiterRequestRequest request);

    List<TechnologyEntity> getAllTechnologies();
    

    RecruiterRequestResponse techRequest(Long requestId);

    RecruiterRequestResponse createRequest(Long requestId);

    RecruiterRequestResponse techName(Long requestId);

    RequestTechResponse technoId(Long requestId);
       
    
    

   
}


