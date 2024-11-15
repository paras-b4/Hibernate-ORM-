package com.paras2;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name="PARAS")
@Table(name="PARAS")
public class Alien1 
{
	private String Name;
	private int Marks;
	@Id
	private int Rollno ;
	
	
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
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	@Override
	public String toString() {
		return "Alien1 [Name=" + Name + ", Marks=" + Marks + ", Rollno=" + Rollno + "]";
	}
	
	
	

}
