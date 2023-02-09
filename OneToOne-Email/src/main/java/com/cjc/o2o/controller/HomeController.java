package com.cjc.o2o.controller;

import java.util.List;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.o2o.model.Employee;
import com.cjc.o2o.serviceInter.ServiceInter;

@RestController
public class HomeController {

	@Autowired
	ServiceInter si;
	
	@Autowired
	public JavaMailSender jms;
	
	@PostMapping("/saveData")
	public void saveData(@RequestBody Employee e)
	{
		
		Employee e1=si.saveEmp(e);
		
		
		SimpleMailMessage m = new SimpleMailMessage();
		m.setTo(e1.getEmail());
		m.setSubject("HELLO");
		m.setText("This is automatic generated email");

		jms.send(m);

	}
	
	@PostMapping("/savelist")
	public List<Employee> saveList(@RequestBody List<Employee> ee)
	{
	
		List<Employee> list=si.saveList(ee);
		for(Employee e1:list)//multiple mail sending
		{
		
			SimpleMailMessage m = new SimpleMailMessage();
			m.setTo(e1.getEmail());
			m.setSubject("HELLO");
			m.setText("This is automatic generated email");

			jms.send(m);
			
			
     	}
		
		return list;

	}
}
