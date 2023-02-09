package com.cjc.o2m.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String state;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Mobileno> mno;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Set<Mobileno> getMno() {
		return mno;
	}
	public void setMno(Set<Mobileno> mno) {
		this.mno = mno;
	}

	
	
  
}
