package com.cjc.webservice.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	private int stuid;
	private String stuname;
	private String stueducation;
	private int feesPaid;
	private int feesRemain;
	private long contactno;
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Course> stucourses;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStueducation() {
		return stueducation;
	}
	public void setStueducation(String stueducation) {
		this.stueducation = stueducation;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getFeesRemain() {
		return feesRemain;
	}
	public void setFeesRemain(int feesRemain) {
		this.feesRemain = feesRemain;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public Set<Course> getStucourses() {
		return stucourses;
	}
	public void setStucourses(Set<Course> stucourses) {
		this.stucourses = stucourses;
	}
	
}
