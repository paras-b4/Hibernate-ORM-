package com.paras.DemoHib;

import javax.persistence.*;
import java.util.*;


import javax.persistence.Id;

import javax.persistence.GenerationType;

import javax.persistence.Entity;



//import javax.persistence.Table;

@Entity
@Table(name="wow")

public class Alien1 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int aid;
	private String aname;
	@Column(name="alien_color" ,length =10)
	private String acolor;
	@Transient // for temperary data storage not stored in db .
	private double x;
	private Fullname fname;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Added_Date")
	private Date addedDate;
	@Embedded
	public Fullname getFname() 
	{
		return fname;
	}
	public void setFname(Fullname fname) {
		this.fname = fname;
	}
	
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Alien1 [aid=" + aid + ", aname=" + aname + ", acolor=" + acolor + ", x=" + x + ", fname=" + fname
				+ ", addedDate=" + addedDate + "]";
	}
	
	

}
