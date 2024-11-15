package com.paras2;

import javax.persistence.Cacheable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name="Student")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Alien 
{
	@Id
	private String Name;
	
	private String Address;
	private int Rollno;
	private int Marks;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Alien [Name=" + Name + ", Address=" + Address + ", Rollno=" + Rollno + ", Marks=" + Marks + "]";
	}
	

}
