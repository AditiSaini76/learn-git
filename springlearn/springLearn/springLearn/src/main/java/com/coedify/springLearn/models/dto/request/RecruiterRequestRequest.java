package com.coedify.springLearn.models.dto.request;
import java.util.List;

import com.coedify.springLearn.models.pojo.RecruiterRequestPojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class RecruiterRequestRequest extends RecruiterRequestPojo{
     private List<Long> technologies;
}
    

