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

import com.cjc.webservice.model.Student;
import com.cjc.webservice.serviceInterface.StudentServiceInter;

@RestController
public class StudentController {
	@Autowired
	StudentServiceInter ssi;
	
	@PostMapping("/postStu")
	public void postStu(@RequestBody Student  s)
	{
		ssi.saveStu(s);
	}

	@GetMapping("/getStu")
	public List<Student> getAll()
	{
		List<Student> slist=ssi.getAllStu();
		return slist;
	}
	
	@PutMapping("/putStu")
	public String updateStudent(@RequestBody Student s)
	{
		ssi.updateStu(s);
		return "Data Updated Successfully";
	}
	
	@DeleteMapping("/deleteStu/{stuid}")
	public String deleteStu(@PathVariable int stuid)
	{
		
		ssi.deleteStu(stuid);
		return "Data Deleted Successfully";
	}
}
