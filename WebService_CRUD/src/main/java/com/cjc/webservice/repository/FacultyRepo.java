package com.cjc.webservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webservice.model.Faculty;

@	Repository
public interface FacultyRepo extends CrudRepository<Faculty, Integer>{

}
