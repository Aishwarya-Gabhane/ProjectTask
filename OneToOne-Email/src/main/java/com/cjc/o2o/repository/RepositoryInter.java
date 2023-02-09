package com.cjc.o2o.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.o2o.model.Employee;

@Repository
public interface RepositoryInter extends CrudRepository<Employee, Integer>{

}
