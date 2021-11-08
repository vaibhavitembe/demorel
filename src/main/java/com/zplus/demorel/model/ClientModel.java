package com.zplus.demorel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="client")

public class ClientModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private Integer clientId;

    @Column
    private String clientName;

    @Column
    private String address;

    @Column
    private String emailId;

    @Column
    private String status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emp_id")
    private EmployeeModel employeeModel;

}
