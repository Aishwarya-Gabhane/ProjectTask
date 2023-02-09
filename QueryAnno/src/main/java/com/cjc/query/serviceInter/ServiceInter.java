package com.cjc.query.serviceInter;

import java.util.List;

import com.cjc.query.model.Student;

public interface ServiceInter {

	public void saveStu(Student s);

	public String getStu(int ss);

	public List<Student> getAllData();

	public List<Student> getByFname(String fname);

}
