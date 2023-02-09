package com.cjc.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webservice.model.User;
import com.cjc.webservice.serviceInterface.UserServiceInter;

@RestController
public class UserController {

	@Autowired
	UserServiceInter si;
	
	@RequestMapping("/postData")
	public void postData(@RequestBody User u)
	{
		si.saveData(u);
	}
	
	@GetMapping("/getData")
	public List<User> getData()
	{
		List<User> ulist=si.getAllData();
		return ulist;
	}
	
	@PutMapping("/updateData")
	public String updateUser(@RequestBody User u)
	{
		si.updateUser(u);
		return "Data updated successfully";
	}
	
	@DeleteMapping("/deleteUser/{uid}")
	public String deleteUser(@PathVariable int uid)
	{
		si.deleteUser(uid);
		return "Data deleted successfully";
	}
	
}
