package com.paras1.DemoHib;

import java.util.ArrayList;


import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Student1")
public class Student 
{
	
	
	//@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int Rollno;
	@Id
	@Column(name="name" )
	private String Name;
	private int Marks;
	@OneToMany(mappedBy="s")
//	private Laptop laptop;
//	@OneToMany(mappedBy="s", fetch=FetchType.EAGER)
	private Collection<Laptop> laptop= new ArrayList<Laptop>();
	
	public Collection<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
/*	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
*/
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	

	
	

}
