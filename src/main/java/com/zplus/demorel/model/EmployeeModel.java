package com.zplus.demorel.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="employee")

public class EmployeeModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer employeeId;

    @Column
    private String employeeName;

    @Column
    private String address;

    @Column
    private String emailId;

 @Column
      private String status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="comp_id")
    private CompanyModel companyModel;

}
