package com.cjc.query.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.query.model.Student;
import com.cjc.query.repository.RepoInter;
import com.cjc.query.serviceInter.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter {

   @Autowired
   RepoInter ri;
	
	@Override
	public void saveStu(Student s) {
		ri.save(s);
		
	}

	@Override
	public String getStu(int ss) {
		
		return ri.stuFind(ss);
	}

	@Override
	public List<Student> getAllData() {
		
		return ri.getAllStu();
	}

	@Override
	public List<Student> getByFname(String fname) {
		
		return ri.getbyFname(fname);
	}

}
