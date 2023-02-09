package com.cjc.o2o.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.o2o.model.Employee;
import com.cjc.o2o.repository.RepositoryInter;
import com.cjc.o2o.serviceInter.ServiceInter;
@Service
public class ServiceImpl implements ServiceInter{

	@Autowired
	RepositoryInter ri;

	@Override
	public Employee saveEmp(Employee e) {
		return ri.save(e);
		
	}

	@Override
	public List<Employee> saveList(List<Employee> ee) {
		
		return (List<Employee>) ri.saveAll(ee);
	}
	
	
}
