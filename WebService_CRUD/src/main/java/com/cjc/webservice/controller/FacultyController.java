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

import com.cjc.webservice.model.Faculty;
import com.cjc.webservice.serviceInterface.FacultyServiceInter;

@RestController
public class FacultyController {
	
	@Autowired
	FacultyServiceInter fi;

	@PostMapping("/postFaculty")
	public String postFaculty(@RequestBody Faculty f)
	{
		
		fi.saveFaculty(f);
		return "Data posted successfully";
		
	}
	
	@GetMapping("/getFaculty")
	public List<Faculty> getAllFaculty()
	{
		List<Faculty> flist=fi.getAllFaculty();
		return flist;
		
	}
	
	@PutMapping("/updateFaculty")
	public String updateFaculty(@RequestBody Faculty ff)
	{
		fi.updateFaculty(ff);
		return "Data updated successfully";
	}
	
	@DeleteMapping("/deleteFaculty/{facultyid}")
	public String deleteFaculty(@PathVariable int facultyid)
	{
		fi.deleteFaculty(facultyid);
		
		return "Data Deleted Successfully";
	}
}
