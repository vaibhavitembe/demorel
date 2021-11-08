package com.zplus.demorel.service;

import com.zplus.demorel.dto.ClientDto;
import com.zplus.demorel.model.ClientModel;

import java.util.List;

public interface ClientService {


    Boolean insertClient(ClientDto clientDto);

    Boolean updateClient(ClientDto clientDto);

    ClientModel getByClientId(Integer clientId);


    List getAllClientDetails();
}
