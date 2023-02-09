package com.cjc.o2m.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobileno {

	@Id
	private int mid;
	private String type;
	private long number;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
}
