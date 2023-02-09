package com.cjc.webservice.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webservice.model.Faculty;
import com.cjc.webservice.repository.FacultyRepo;
import com.cjc.webservice.serviceInterface.FacultyServiceInter;

@Service
public class FacultyServiceImpl implements FacultyServiceInter{
	
	@Autowired
	FacultyRepo fr;

	

	@Override
	public void saveFaculty(Faculty f) {
		fr.save(f);
	}



	@Override
	public List<Faculty> getAllFaculty() {
		
		return (List<Faculty>) fr.findAll();
	}



	@Override
	public void updateFaculty(Faculty ff) {
		fr.save(ff);
	}



	@Override
	public void deleteFaculty(int facultyid) {
		fr.deleteById(facultyid);
		
	}

}
