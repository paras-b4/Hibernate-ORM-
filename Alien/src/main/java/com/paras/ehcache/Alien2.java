package com.paras.ehcache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien2 {
	
	@Id
	private int Alienid;
	private String Aname;
	private String Acolor;
	
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
	public String getAcolor() {
		return Acolor;
	}
	public void setAcolor(String acolor) {
		Acolor = acolor;
	}
	@Override
	public String toString() {
		return "Alien2 [Alienid=" + Alienid + ", Aname=" + Aname + ", Acolor=" + Acolor + "]";
	}
	
	
	
}
