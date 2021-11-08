package com.zplus.demorel.controller;

import com.zplus.demorel.dto.CnameReqDto;
import com.zplus.demorel.dto.CompanyReqDto;
import com.zplus.demorel.dto.res.ResDto;
import com.zplus.demorel.model.CompanyModel;
import com.zplus.demorel.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    private ResponseEntity insertCompany(@RequestBody CompanyReqDto companyDto) {
        Boolean flag = companyService.insertCompany(companyDto);

        if (flag)
            return new ResponseEntity(flag, HttpStatus.OK);
        else
            return new ResponseEntity(flag, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping
    private ResponseEntity updateCompany(@RequestBody CompanyReqDto companyDto) {
        Boolean flag = companyService.updateCompany(companyDto);

        if (flag)
            return new ResponseEntity(flag, HttpStatus.OK);
        else
            return new ResponseEntity(flag, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping
    private ResponseEntity getAllCompanyDetails() {
        List list = companyService.getAllCompanyDetails();

        if (list.size() != 0)
            return new ResponseEntity(list, HttpStatus.OK);
        else
            return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/getCompanyDetailsByCompId/{compId}")
    private ResponseEntity getCompanyDetailsByCompanyId(@PathVariable Integer compId) {
        CompanyModel companyModel = companyService.getCompanyDetailsByCompanyId(compId);

        if (companyModel != null)
            return new ResponseEntity(companyModel, HttpStatus.OK);
        else
            return new ResponseEntity(companyModel, HttpStatus.INTERNAL_SERVER_ERROR);

    }


    @GetMapping(value = "activeCompanyDetails")
    private ResponseEntity activeCompanyDetails() {
        List list = companyService.activeCompanyDetails();

        return new ResponseEntity(list, HttpStatus.OK);
    }


    @PostMapping("/findByAddressAndCompanyName/")
    private ResponseEntity findByAddressAndCompanyName(@RequestBody CnameReqDto cnameReqDtoReqDto) {
        List list = companyService.findByAddressAndCompanyName(cnameReqDtoReqDto);
        return new ResponseEntity(list, HttpStatus.OK);

    }


    @GetMapping("/getCompanyId/{companyId}")
    private ResponseEntity getCompanyId(@PathVariable Integer companyId) {
        ResDto resDto = companyService.getCompanyId(companyId);

        if (resDto != null)
            return new ResponseEntity(resDto, HttpStatus.OK);
        else
            return new ResponseEntity(resDto, HttpStatus.INTERNAL_SERVER_ERROR);

    }


}




