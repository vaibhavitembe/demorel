package com.zplus.demorel.dao;

import com.zplus.demorel.model.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientDao extends CrudRepository<ClientModel,Integer> {

}