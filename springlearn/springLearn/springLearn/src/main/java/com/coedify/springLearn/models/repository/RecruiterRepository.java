package com.coedify.springLearn.models.repository;

import java.util.List;

import com.coedify.springLearn.models.entity.RecruiterRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<RecruiterRequestEntity,Long>{
   
   String select = null;
   List<RecruiterRequestEntity> findByMobileNumber(String mobileNumber);
   //custom query
   @Query("select ot from RecruiterRequestEntity ot where ot.mobileNumber=:number")
   List<RecruiterRequestEntity> findByPhoneNumber(@Param("number") String number);

   //native query
   @Query(value="select ot.*from recriuter_request ot where ot.mobile_number=:number" , nativeQuery = true)
   List<RecruiterRequestEntity> findByPNumber(@Param("number") String number);

   
}
