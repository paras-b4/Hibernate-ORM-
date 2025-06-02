package com.paras.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App3 {

	public static void main(String [] args) 
	{
		
		Alien3 a=new Alien3();
		a.setAlienid(1);
		a.setAname("paras");
		a.setAcolor("white");
		a.setMarks(100);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(" ");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
	}
}
