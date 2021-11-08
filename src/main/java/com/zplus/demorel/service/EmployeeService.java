package com.zplus.demorel.service;

import com.zplus.demorel.dto.EmployeeDto;
import com.zplus.demorel.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    Boolean insertEmployee(EmployeeDto employeeDto);

    Boolean updateEmployee(EmployeeDto employeeDto);

    List getAllEmployeeDetails();

    EmployeeModel getByEmployeeId(Integer employeeId);
}
