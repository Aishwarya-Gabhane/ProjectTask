package com.cjc.webservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
   private int facultyid;
   private String facultyname;
   private long facultycontact;
   private String facultyemail;
   private String facultyeducation;
public int getFacultyid() {
	return facultyid;
}
public void setFacultyid(int facultyid) {
	this.facultyid = facultyid;
}
public String getFacultyname() {
	return facultyname;
}
public void setFacultyname(String facultyname) {
	this.facultyname = facultyname;
}
public long getFacultycontact() {
	return facultycontact;
}
public void setFacultycontact(long facultycontact) {
	this.facultycontact = facultycontact;
}
public String getFacultyemail() {
	return facultyemail;
}
public void setFacultyemail(String facultyemail) {
	this.facultyemail = facultyemail;
}
public String getFacultyeducation() {
	return facultyeducation;
}
public void setFacultyeducation(String facultyeducation) {
	this.facultyeducation = facultyeducation;
}
   
}
