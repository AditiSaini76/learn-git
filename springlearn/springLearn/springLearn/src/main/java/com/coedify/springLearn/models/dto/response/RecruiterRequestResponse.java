package com.coedify.springLearn.models.dto.response;

import com.coedify.springLearn.models.pojo.RecruiterRequestPojo;
import java.util.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class RecruiterRequestResponse extends RecruiterRequestPojo {
    
    private List<String> technologies;
     private List<Long> technology;

}
