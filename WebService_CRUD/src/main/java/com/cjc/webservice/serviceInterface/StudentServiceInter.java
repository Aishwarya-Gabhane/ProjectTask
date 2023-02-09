package com.cjc.webservice.serviceInterface;

import java.util.List;

import com.cjc.webservice.model.Student;

public interface StudentServiceInter {

	public void saveStu(Student s);

	public List<Student> getAllStu();

	public void updateStu(Student s);

	public void deleteStu(int stuid);

}
