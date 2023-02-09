package com.cjc.o2m.repositoryinterface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.o2m.model.Student;

@Repository
public interface RepoInter extends CrudRepository<Student, Integer>{

}
