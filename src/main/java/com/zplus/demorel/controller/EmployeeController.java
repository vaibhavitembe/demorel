package com.zplus.demorel.controller;

import com.zplus.demorel.dto.EmployeeDto;
import com.zplus.demorel.model.EmployeeModel;
import com.zplus.demorel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping(value="employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    private ResponseEntity insertEmployee(@RequestBody EmployeeDto employeeDto){
        Boolean flag = employeeService.insertEmployee(employeeDto);

        if(flag)
            return new ResponseEntity(flag, HttpStatus.OK);
        else
            return new ResponseEntity(flag,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping
    private ResponseEntity updateEmployee(@RequestBody EmployeeDto employeeDto){
        Boolean flag= employeeService.updateEmployee(employeeDto);

        if(flag)
            return  new ResponseEntity(flag,HttpStatus.OK);
        else
            return new ResponseEntity(flag,HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping
    private ResponseEntity getAllEmployeeDetails()
    {
        List list=employeeService.getAllEmployeeDetails();

        if(list.size()!=0)
            return new ResponseEntity(list, HttpStatus.OK);
        else
            return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);

    }
    @GetMapping("/getByEmployeeId/{employeeId}")
    private ResponseEntity getByEmployeeId (@PathVariable Integer employeeId)
    {
        EmployeeModel employeeModel =employeeService.getByEmployeeId(employeeId);
        if(employeeModel!=null)
            return new ResponseEntity(employeeModel, HttpStatus.OK);
        else
            return new ResponseEntity(employeeModel, HttpStatus.INTERNAL_SERVER_ERROR);
    }





}
