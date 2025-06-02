package com.paras.Laptops;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
	
	@Id
	private int Lid;
	private String Lname;
	private int price;
	
	@ManyToOne
	private Alien1 alien;

	public int getLid() {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Alien1 getAlien() {
		return alien;
	}

	public void setAlien(Alien1 alien) {
		this.alien = alien;
	}

	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + ", price=" + price + " ]";
	}
	
	
}
