package com.coedify.springLearn.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.coedify.springLearn.commons.enums.Duration;
import com.coedify.springLearn.commons.enums.Experience;
import com.coedify.springLearn.commons.enums.ResourseStrength;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="recriuter_request")
@Setter
@Getter
@Data
public class RecruiterRequestEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;

   @Column(name= "tech_stack_one")
  private Long techStack1;
   
   @Column(name="tech_stack_two")
   private Long techStack2;
    
   
   @Column(name="experience")
   @Enumerated(EnumType.ORDINAL)
   private Experience experience;
   
  
   @Column(name="resourse_strength")
   @Enumerated(EnumType.ORDINAL)
   private ResourseStrength resourseStrength;
   
   
   @Column(name="duration")
   @Enumerated(EnumType.ORDINAL)
   private Duration duration;
   
   @Column(name="name")
   private String name;
   
   @Column(name="mobile_number")
   private String mobileNumber;
   
   @Column(name="company_name")
   private String companyName;
   
   @Column(name="email")
   private String email;


}
