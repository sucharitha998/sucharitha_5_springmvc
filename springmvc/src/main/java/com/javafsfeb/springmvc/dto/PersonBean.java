package com.javafsfeb.springmvc.dto;

import java.io.Serializable;
import java.util.Date;



public class PersonBean implements Serializable {
	private String name;
	private Date dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
