package com.zplus.demorel.service.Impl;

import com.zplus.demorel.dao.EmployeeDao;
import com.zplus.demorel.dto.EmployeeDto;
import com.zplus.demorel.model.CompanyModel;
import com.zplus.demorel.model.EmployeeModel;
import com.zplus.demorel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class EmployeeServiceImpl implements EmployeeService {

        @Autowired
        private EmployeeDao employeeDao;

        @Override
        public Boolean insertEmployee(EmployeeDto employeeDto) {
            EmployeeModel employeeModel = new EmployeeModel();

            employeeModel.setEmployeeName(employeeDto.getEmployeeName());
            employeeModel.setAddress(employeeDto.getAddress());
            employeeModel.setEmailId(employeeDto.getEmailId());
            employeeModel.setStatus(employeeDto.getStatus());
            try{
                CompanyModel companyModel = new CompanyModel();
                companyModel.setCompId(employeeDto.getCompId());

                employeeModel.setCompanyModel(companyModel);
                employeeDao.save(employeeModel);
                return  true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }



        }

        @Override
        public Boolean updateEmployee(EmployeeDto employeeDto) {
            EmployeeModel employeeModel = new EmployeeModel();

            employeeModel.setEmployeeId(employeeDto.getEmployeeId());
            employeeModel.setEmployeeName(employeeDto.getEmployeeName());
            employeeModel.setAddress(employeeDto.getAddress());
            employeeModel.setEmailId(employeeDto.getEmailId());
            employeeModel.setStatus(employeeDto.getStatus());
            try{
                CompanyModel companyModel = new CompanyModel();
                companyModel.setCompId(employeeDto.getCompId());

                employeeModel.setCompanyModel(companyModel);
                employeeDao.save(employeeModel);
                return  true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

        }

        @Override
        public List getAllEmployeeDetails() {
            return (List) employeeDao.findAll();
        }

        @Override
        public EmployeeModel getByEmployeeId(Integer employeeId) {
            EmployeeModel employeeModel = new EmployeeModel();
            try {
                employeeModel = employeeDao.findOne(employeeId);
                return employeeModel;
            } catch (Exception e) {
                e.printStackTrace();
                return employeeModel;
            }

        }

    }







































































