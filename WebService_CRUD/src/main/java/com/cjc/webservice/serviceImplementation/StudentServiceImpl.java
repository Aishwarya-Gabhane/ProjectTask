package com.cjc.webservice.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webservice.model.Student;
import com.cjc.webservice.repository.StudentRepo;
import com.cjc.webservice.serviceInterface.StudentServiceInter;

@Service
public class StudentServiceImpl implements StudentServiceInter{
	
	@Autowired
	StudentRepo sr;

	@Override
	public void saveStu(Student s) {
		
		sr.save(s);
	}

	@Override
	public List<Student> getAllStu() {
		
		return (List<Student>) sr.findAll();
	}

	@Override
	public void updateStu(Student s) {
		sr.save(s);
		
	}

	@Override
	public void deleteStu(int stuid) {
		sr.deleteById(stuid);
		
	}
	

}
