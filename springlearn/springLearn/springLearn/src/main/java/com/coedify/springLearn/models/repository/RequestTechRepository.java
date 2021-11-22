package com.coedify.springLearn.models.repository;

import java.util.List;

import com.coedify.springLearn.models.entity.RequestTechEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RequestTechRepository extends JpaRepository<RequestTechEntity,Long> {

    List<RequestTechEntity> findByRequestId(Long id);

    List<RequestTechEntity> findTechId(Long requestId);

    

  
}
