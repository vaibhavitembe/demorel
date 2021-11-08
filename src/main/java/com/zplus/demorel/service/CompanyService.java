package com.zplus.demorel.service;

import com.zplus.demorel.dto.CnameReqDto;
import com.zplus.demorel.dto.CompanyReqDto;
import com.zplus.demorel.dto.res.ResDto;
import com.zplus.demorel.model.CompanyModel;

import java.util.List;

public interface CompanyService {
    Boolean insertCompany(CompanyReqDto companyDto);

    Boolean updateCompany(CompanyReqDto companyDto);

    List getAllCompanyDetails();


    List activeCompanyDetails();

    List findByAddressAndCompanyName(CnameReqDto cnameReqDtoReqDto);

    CompanyModel getCompanyDetailsByCompanyId(Integer compId);

    ResDto getCompanyId(Integer companyId);
}
