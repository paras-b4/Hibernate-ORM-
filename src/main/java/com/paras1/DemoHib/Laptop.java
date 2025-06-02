package com.paras1.DemoHib;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="Laptop1")
public class Laptop 
{
	
	@Id                                                                                                                 
	private int Lid;
	
	private String Lname;
	//	@ManyToMany
	//private Collection<Student> s = new ArrayList<Student>();
	@ManyToOne
	private Student s;
	
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public int getLid() 
	{
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
/*	public Collection<Student> getS() {
		return s;
	}
	public void setS(Collection<Student> s) {
		this.s = s;
	}*/
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}

}
