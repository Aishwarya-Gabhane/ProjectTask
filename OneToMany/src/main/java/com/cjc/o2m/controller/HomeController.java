package com.cjc.o2m.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.o2m.model.Mobileno;
import com.cjc.o2m.model.Student;
import com.cjc.o2m.serviceinterface.ServiceInter;

@RestController
public class HomeController {

	@Autowired
	ServiceInter si;
	
	@PostMapping("/postStu")
	public String postData(@RequestBody Student s)
	{
		si.saveStu(s);
		return "Data saved successfully";
	}
	
	@PostMapping("/postMulStu")
	public List<Student> postmStu(@RequestBody List<Student> ss)
	{
		return si.savelStu(ss);
	}
	
	@GetMapping("/getStu")
	public Iterable<Student> getAll()
	{
	Iterable<Student>	slist=si.getAllStu();
		
	return slist;
	}
	
	@PutMapping("/updateStu")
	public String updateStu(@RequestBody Student ss)
	{
		si.updateStu(ss);
		
		return "Data Updated Successfully";
	}
	
	@DeleteMapping("/deleteData/{sid}")
	public String deleteStu(@PathVariable int sid)
	{
		si.deleteStu(sid);
		
		return "Data deleted Successfully";
	}
	
	@PostMapping("/postMob")
	public void postMobData(@RequestBody Mobileno m)//single data save
	{
		si.saveMob(m);
	}
	
	@PostMapping("/postList")
	public List<Mobileno> postMob(@RequestBody List<Mobileno> mm)//multiple data save
	{
		List<Mobileno>  listm=si.savelMob(mm);
		
		return listm;
	}
}
