package com.coedify.springLearn.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="base_table")
@Setter
@Getter
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
 
    @Column(name= "created_by")
   private String createdBy;

   @Column(name= "created_at")
   private String createdAt;

   @Column(name= "updated_by")
   private String updatedBy;

   @Column(name= "updated_at")
   private String updatedAt;
}
