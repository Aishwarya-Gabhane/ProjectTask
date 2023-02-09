package com.cjc.webservice.serviceInterface;

import java.util.List;

import com.cjc.webservice.model.Faculty;

public interface FacultyServiceInter {

	public void saveFaculty(Faculty f);

	public List<Faculty> getAllFaculty();

	public void updateFaculty(Faculty ff);

	public void deleteFaculty(int facultyid);

}
