package com.cjc.o2m.repositoryinterface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.o2m.model.Mobileno;
@Repository
public interface RepoInterMob extends CrudRepository<Mobileno, Integer>{

}
