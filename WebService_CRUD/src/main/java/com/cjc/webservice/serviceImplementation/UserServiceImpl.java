package com.cjc.webservice.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webservice.model.User;
import com.cjc.webservice.repository.UserRepo;
import com.cjc.webservice.serviceInterface.UserServiceInter;

@Service
public class UserServiceImpl implements UserServiceInter{

	@Autowired
	UserRepo ur;
	
	@Override
	public void saveData(User u) {
		
		ur.save(u);
	}

	@Override
	public List<User> getAllData() {
		
		return (List<User>) ur.findAll();
	}

	@Override
	public void updateUser(User u) {
		ur.save(u);
		
	}

	@Override
	public void deleteUser(int uid) {
		ur.deleteById(uid);
		
	}

}
