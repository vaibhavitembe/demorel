package com.zplus.demorel.dao;

import com.zplus.demorel.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

}