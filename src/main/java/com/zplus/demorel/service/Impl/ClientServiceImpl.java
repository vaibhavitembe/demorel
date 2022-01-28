package com.zplus.demorel.service.Impl;

import com.zplus.demorel.dao.ClientDao;
import com.zplus.demorel.dto.ClientDto;
import com.zplus.demorel.model.ClientModel;
import com.zplus.demorel.model.EmployeeModel;
import com.zplus.demorel.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;


    @Override
    public Boolean insertClient(ClientDto clientDto) {

        ClientModel clientModel = new ClientModel();

        clientModel.setClientName(clientDto.getClientName());
        clientModel.setAddress(clientDto.getAddress());
        clientModel.setEmailId(clientDto.getEmailId());
        clientModel.setStatus(clientDto.getStatus());

        try {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setEmployeeId(clientDto.getEmpId());

            clientModel.setEmployeeModel(employeeModel);
            clientDao.save(clientModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


    @Override
    public Boolean updateClient(ClientDto clientDto) {
        ClientModel clientModel = new ClientModel();

        clientModel.setClientId(clientDto.getClientId());
        clientModel.setClientName(clientDto.getClientName());
        clientModel.setAddress(clientDto.getAddress());
        clientModel.setEmailId(clientDto.getEmailId());
        clientModel.setStatus(clientDto.getStatus());

        try {
            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setEmployeeId(clientDto.getEmpId());

            clientModel.setEmployeeModel(employeeModel);
            clientDao.save(clientModel);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public ClientModel getByClientId(Integer clientId) {
        ClientModel clientModel = new ClientModel();
        try {
            clientModel = clientDao.findOne(clientId);
            return clientModel;
        } catch (Exception e) {
            e.printStackTrace();
            return clientModel;
        }

    }

    @Override
    public List getAllClientDetails() {
        return (List) clientDao.findAll();

    }
}
















































