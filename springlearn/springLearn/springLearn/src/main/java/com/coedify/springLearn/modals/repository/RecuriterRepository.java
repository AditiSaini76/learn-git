package com.coedify.springLearn.modals.repository;

import com.coedify.springLearn.modals.entity.RecruiterRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecuriterRepository extends JpaRepository<RecruiterRequestEntity,Long>{
    
}
