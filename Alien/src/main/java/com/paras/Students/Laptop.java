package com.paras.Students;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name="Laptop_table")
public class Laptop {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Lap_id;
	private String name;
	@ManyToMany
	private List<student> stud=new ArrayList<student>();
	
	
	
	public void setStud(List<student> stud) {
		this.stud = stud;
	}
	
	
	public List<student> getStud() {
		return stud;
	}


	//	public student getStud() {
//		return stud;
//	}
//	public void setStud(student stud) {
//		this.stud = stud;
//	}
	public int getLap_id() {
		return Lap_id;
	}
	public void setLap_id(int lap_id) {
		Lap_id = lap_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Laptop [Lap_id=" + Lap_id + ", name=" + name + "]";
	}
	
	
	
}
