package com.cjc.webservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webservice.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

}
