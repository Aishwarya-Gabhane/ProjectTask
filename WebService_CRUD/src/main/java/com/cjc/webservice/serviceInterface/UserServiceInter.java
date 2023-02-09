package com.cjc.webservice.serviceInterface;

import java.util.List;

import com.cjc.webservice.model.User;

public interface UserServiceInter {

	public void saveData(User u);

	public List<User> getAllData();

	public void updateUser(User u);

	public void deleteUser(int uid);

}
