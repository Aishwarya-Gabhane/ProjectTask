package com.cjc.webservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webservice.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
