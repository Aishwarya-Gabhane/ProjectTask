package com.cjc.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.query.model.Student;
import com.cjc.query.serviceInter.ServiceInter;

@RestController
public class HomeController {

	@Autowired
	ServiceInter si;
	
	@PostMapping("/postData")
	public String saveData(@RequestBody Student s)
	{
		si.saveStu(s);
		
		return "done";
	}
	
	@GetMapping("/getData/{sid}")
	public String getData(@PathVariable("sid") int ss)
	{
		return si.getStu(ss);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStu()
	{
		List<Student> sl=si.getAllData();
		
		return sl;
	}
	
	@GetMapping("/getId/{fname}")
	public List<Student> getByName(@PathVariable("fname") String fname )
	{
		
		return si.getByFname(fname);
	}
}
