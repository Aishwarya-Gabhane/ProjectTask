package com.cjc.webservice.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webservice.model.Course;
import com.cjc.webservice.repository.CourseRepo;
import com.cjc.webservice.serviceInterface.CourseServiceInter;

@Service
public class CourseServiceImpl implements CourseServiceInter{
	
	@Autowired
	CourseRepo cri;

	@Override
	public void saveCourse(Course c) {
		cri.save(c);
		
	}

	@Override
	public List<Course> getAllCourse() {
		
		return (List<Course>) cri.findAll();
	}

	@Override
	public void updateCourse(Course c) {
		cri.save(c);
		
	}

	@Override
	public void deleteCourse(int courseid) {
		cri.deleteById(courseid);
		
	}

	



}
