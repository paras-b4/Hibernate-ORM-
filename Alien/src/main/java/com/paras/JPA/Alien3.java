package com.paras.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien3 {

	@Id
	private int Alienid;
	private String Aname;
	private String Acolor;
	private int marks;
	public int getAlienid() {
		return Alienid;
	}
	public void setAlienid(int alienid) {
		Alienid = alienid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getAcolor() {
		return Acolor;
	}
	public void setAcolor(String acolor) {
		Acolor = acolor;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Alien3 [Alienid=" + Alienid + ", Aname=" + Aname + ", Acolor=" + Acolor + ", marks=" + marks + "]";
	}
	
}
