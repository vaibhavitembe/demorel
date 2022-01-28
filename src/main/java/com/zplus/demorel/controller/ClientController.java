package com.zplus.demorel.controller;


import com.zplus.demorel.dto.ClientDto;
import com.zplus.demorel.model.ClientModel;
import com.zplus.demorel.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    private ResponseEntity insertClient(@RequestBody ClientDto clientDto) {
        Boolean flag = clientService.insertClient(clientDto);

        if (flag)
            return new ResponseEntity(flag, HttpStatus.OK);
        else
            return new ResponseEntity(flag, HttpStatus.INTERNAL_SERVER_ERROR);

    }


    @PutMapping
    private ResponseEntity UpdateClient(@RequestBody ClientDto clientDto) {
        Boolean flag = clientService.updateClient(clientDto);

        if (flag)
            return new ResponseEntity(flag, HttpStatus.OK);
        else
            return new ResponseEntity(flag, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping
    private ResponseEntity getAllClientDetails() {
        List list = clientService.getAllClientDetails();

        if (list.size() != 0)
            return new ResponseEntity(list, HttpStatus.OK);
        else{}
            return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping("/getByClientId/{clientId}")
    private ResponseEntity getByClientId(@PathVariable Integer clientId) {
        ClientModel clientModel = clientService.getByClientId(clientId);
        if (clientModel != null)
            return new ResponseEntity(clientModel, HttpStatus.OK);
        else
            return new ResponseEntity(clientModel, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}









