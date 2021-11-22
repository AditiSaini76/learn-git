package com.coedify.springLearn.commons.converter;
import java.util.Objects;

import com.coedify.springLearn.models.dto.response.RequestTechResponse;
import com.coedify.springLearn.models.entity.RequestTechEntity;

public class RequestTechConverter {
    public static RequestTechResponse entityToResponse (RequestTechEntity requestTechEntity){
        RequestTechResponse response =new RequestTechResponse();
         if(Objects.isNull(requestTechEntity))
         return null;
         response.setId(requestTechEntity.getId());
         response.setRequestId(requestTechEntity.getRequestId());
         response.setTechId(requestTechEntity.getTechId());
        return response;
}
}
