package com.paras.Alien;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="Alien_table")
public class Alien {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int Alienid;
	@Embedded
	private FullName name;
	@Column(name="Acolor")
	//@Transient
	private String color;
	
	public int getAlienid() {
		return Alienid;
	}
	public void setAlienid(int alienid) {
		Alienid = alienid;
	}
	public FullName getname() {
		return name;
	}
	public void setname(FullName name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [Alienid=" + Alienid + ", FullName=" + name + ", color=" + color + "]";
	}
	
	
	

}
