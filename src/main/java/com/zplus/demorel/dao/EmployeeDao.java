package com.zplus.demorel.dao;

import com.zplus.demorel.dto.res.EmpResDto;
import com.zplus.demorel.model.EmployeeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Query("select  new  com.zplus.demorel.dto.res.EmpResDto(em.employeeId as employeeId,em.employeeName  as employeeName, em.address as address) from EmployeeModel as em where em.companyModel.companyName like '%searchtext%'")
    List<EmpResDto> getBySearchtext(@Param("searchtext")String searchtext);
}