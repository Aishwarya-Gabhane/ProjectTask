package com.cjc.webservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {

	@Id
	private int courseid;
	private String coursename;
	private String coursetype;
	private float coursefees;
	@OneToOne(cascade = CascadeType.ALL)
	private Faculty faculty;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}
	public float getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}
