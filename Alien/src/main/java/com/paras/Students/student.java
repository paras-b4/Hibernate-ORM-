package com.paras.Students;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="Student_table")
public class student {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stud_id;
	private String name;
	private int marks;
	@ManyToMany(mappedBy = "stud",fetch=FetchType.EAGER)
	private List<Laptop> laptop=new ArrayList<Laptop>();
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [stud_id=" + stud_id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}
