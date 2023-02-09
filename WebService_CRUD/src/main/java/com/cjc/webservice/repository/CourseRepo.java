package com.cjc.webservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webservice.model.Course;

@Repository
public interface CourseRepo extends CrudRepository<Course, Integer> {

}
