package com.zplus.demorel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmployeeDto {
    private Integer employeeId;
    private String  employeeName;
    private String  status;
    private String  address;
    private String  emailId;
    private Integer compId;

}