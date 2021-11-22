package com.coedify.springLearn.models.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.coedify.springLearn.commons.enums.Duration;
import com.coedify.springLearn.commons.enums.Experience;
import com.coedify.springLearn.commons.enums.ResourseStrength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class RecruiterRequestPojo extends BasePojo {
    
    private Long id;
    private Long techStack1;
    private Long techStack2;
    private Experience experience;
    private ResourseStrength resourseStrength;
    private Duration duration;

    @NotBlank
    private String name;
    @Pattern(regexp = "^[0-9]{10}$" , message = "Mobile Number is not valid")
    private String mobileNumber;
    private String companyName;
    @Email
    private String email;
 
 
}
