package com.zplus.demorel.service.Impl;

import com.zplus.demorel.dao.CompanyDao;
import com.zplus.demorel.dao.EmployeeDao;
import com.zplus.demorel.dto.CnameReqDto;
import com.zplus.demorel.dto.CompanyReqDto;
import com.zplus.demorel.dto.res.EmpResDto;
import com.zplus.demorel.dto.res.ResDto;
import com.zplus.demorel.model.CompanyModel;
import com.zplus.demorel.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Boolean insertCompany(CompanyReqDto companyDto) {


        CompanyModel companyModel = new CompanyModel();


        companyModel.setCompanyName(companyDto.getCompanyName());
        companyModel.setStatus(companyDto.getStatus());
        companyModel.setAddress(companyDto.getAddress());
        companyModel.setEmailId(companyDto.getEmailid());

        try {
            companyDao.save(companyModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }

    @Override
    public Boolean updateCompany(CompanyReqDto companyDto) {

        CompanyModel companyModel = new CompanyModel();

        companyModel.setCompId(companyDto.getCompId());
        companyModel.setCompanyName(companyDto.getCompanyName());
        companyModel.setStatus(companyDto.getStatus());
        companyModel.setAddress(companyDto.getAddress());
        companyModel.setEmailId(companyDto.getEmailid());
        try {

            companyDao.save(companyModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public List getAllCompanyDetails() {
        return (List) companyDao.findAll();
    }

    @Override
    public CompanyModel getCompanyDetailsByCompanyId(Integer compId) {
        CompanyModel companyModel = new CompanyModel();

        try {
            companyModel = companyDao.findOne(compId);
            return companyModel;
        } catch (Exception e) {
            e.printStackTrace();
            return companyModel;
        }
    }

    @Override
    public ResDto getCompanyId(Integer companyId) {
        ResDto resDto = (ResDto) companyDao.getCompanyId(companyId);
        return resDto;
    }

    @Override
    public List<EmpResDto> getBySearchtext(String searchtext) {
        List<EmpResDto> empResDtoList = employeeDao.getBySearchtext(searchtext);
        return empResDtoList;
    }

    @Override
    public List activeCompanyDetails() {
        return companyDao.findByStatus("Active");
    }

    @Override
    public List findByAddressAndCompanyName(CnameReqDto cnameReqDtoReqDto) {
        //List list = companyDao.findByAddressAndCompanyName(cnameReqDtoReqDto.getAddress(), cnameReqDtoReqDto.getComp());
        return null;
    }

}




