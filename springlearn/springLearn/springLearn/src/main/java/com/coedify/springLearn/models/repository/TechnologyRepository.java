package com.coedify.springLearn.models.repository;

import java.util.List;

import com.coedify.springLearn.models.entity.TechnologyEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<TechnologyEntity,Long>{
    
    List<TechnologyEntity> findAll();
 
  
}
