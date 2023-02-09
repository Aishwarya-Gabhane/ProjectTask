package com.cjc.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webservice.model.Course;
import com.cjc.webservice.serviceInterface.CourseServiceInter;

@RestController
public class CourseController {

	@Autowired
	CourseServiceInter csi;
	
	@PostMapping("/postCourse")
	public void postCourse (@RequestBody Course c)
	{
		csi.saveCourse(c);
		
	}
	
	@GetMapping("/getCourse")
	public List<Course> getCourse()
	{
		List<Course> clist=csi.getAllCourse();
		
		return clist;
	}
	
	@PutMapping("/putCourse")
	public String updateCourse(@RequestBody Course c)
	{
		csi.updateCourse(c);
		return "Data Updated Successfully";
	}
	
	@DeleteMapping("/deleteCourse/{courseid}")
	public String deleteCourse(@PathVariable int courseid)
	{
		
		csi.deleteCourse(courseid);
		return "Data Deleted Successfully";
		
	}
	
	
}
