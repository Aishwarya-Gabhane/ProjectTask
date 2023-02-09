package com.cjc.o2m.serviceinterface;

import java.util.List;

import com.cjc.o2m.model.Mobileno;
import com.cjc.o2m.model.Student;

public interface ServiceInter {

	public  void saveStu(Student s);

	public Iterable<Student> getAllStu();

	public void updateStu(Student ss);

	public void deleteStu(int sid);

	public void saveMob(Mobileno m);//mobile

	public List<Mobileno> savelMob(List<Mobileno> mm);

	public List<Student> savelStu(List<Student> ss);

	

}
