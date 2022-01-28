package com.zplus.demorel.dao;

import com.zplus.demorel.dto.res.EmpResDto;
import com.zplus.demorel.dto.res.ResDto;
import com.zplus.demorel.model.CompanyModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyDao extends CrudRepository<CompanyModel, Integer> {

    @Query(value = "select new com.zplus.demorel.dto.res.ResDto(cm.compId as compId,cm.companyName as companyName,cm.address as address,cm.status as status) from CompanyModel as cm where cm.compId=:compId")
    ResDto getCompanyId(@Param("compId") Integer companyId);

//    @Query(value = "SELECT * FROM CompanyModel WHERE company_Name or address= term;", nativeQuery = true)
//    String getTitleBySubject(String term);


    //List findByAddressAndCompanyName(String contactNo, String name);

    List findByStatus(String active);



    //bject getTitleByCompanyname(String term);
}