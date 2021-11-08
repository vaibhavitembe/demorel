package com.zplus.demorel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyReqDto {
    private Integer compId;
    private String companyName;
    private String address;
    private String status;
     private String emailid;
}