package com.cjc.o2m.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cjc.o2m.model.Mobileno;
import com.cjc.o2m.model.Student;
import com.cjc.o2m.repositoryinterface.RepoInter;
import com.cjc.o2m.repositoryinterface.RepoInterMob;
import com.cjc.o2m.serviceinterface.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter{

	@Autowired
	RepoInter ri;

	@Override
	public void saveStu(Student s) {
		ri.save(s);
		
	}

	@Override
	public Iterable<Student> getAllStu() {
		
		return ri.findAll();
	}

	@Override
	public void updateStu(Student ss) {
		ri.save(ss);
		
	}

	@Override
	public void deleteStu(int sid) {
	ri.deleteById(sid);
		
	}
	
	@Autowired
	RepoInterMob rm;

	@Override
	public void saveMob(Mobileno m) {
		rm.save(m);
	}

	@Override
	public List<Mobileno> savelMob(List<Mobileno> mm) {
		
		return (List<Mobileno>) rm.saveAll(mm);
	}

	@Override
	public List<Student> savelStu(List<Student> ss) {
	
		return (List<Student>) ri.saveAll(ss);
	}

	
}
