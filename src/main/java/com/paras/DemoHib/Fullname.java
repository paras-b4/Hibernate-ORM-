package com.paras.DemoHib;

import javax.persistence.Embeddable;

@Embeddable
public class Fullname 
{
	private String Fname;
	private String Midname;
	private String Lname;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMidname() {
		return Midname;
	}
	public void setMidname(String midname) {
		Midname = midname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	

}
