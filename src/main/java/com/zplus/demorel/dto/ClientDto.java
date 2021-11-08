package com.zplus.demorel.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ClientDto {
    private Integer clientId;
    private String  clientName;
    private String  status;
    private String  address;
    private String  emailId;
    private Integer empId;

}