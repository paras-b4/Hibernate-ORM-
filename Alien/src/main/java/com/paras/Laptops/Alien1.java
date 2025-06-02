package com.paras.Laptops;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity()
public class Alien1 {

	@Id
	private int Alienid;
	private String Aname;
	
	@OneToMany(mappedBy="alien",fetch=FetchType.EAGER)
	private List<Laptop> laptop=new ArrayList<>();
	
	
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

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Alien1 [Alienid=" + Alienid + ", Aname=" + Aname + "]";
	}
	
	
}
