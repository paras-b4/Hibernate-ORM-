package com.paras1.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Collection;


public class App1 
{
	public static void main(String[] str)
	{
	
	Configuration con = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
	ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf = con.buildSessionFactory(sr);
	Session session = sf.openSession();
	Transaction tx=session.beginTransaction();
	
	
	 
	
	
	Laptop laptop=new Laptop();
	Student s=new Student();
	s.setRollno(7);
	s.setName("Paras2");
	s.setMarks(92);
	s.getLaptop().add(laptop);
	session.save(s);
	
	
	laptop.setLid(103);
	laptop.setLname("Lenovo");
	//laptop.setS(s);
	//laptop.getS.add(s);
	
	 
//	
	
	session.save(laptop);
	// Fetch Eager and lazy  // if you want to use eager then mention in the 
//	Student s= session.get(Student.class,"Disha");
//	     
//	System.out.println(s.getMarks());
//	
//	Collection <Laptop> laptop = s.getLaptop();
//	for(Laptop l: laptop)
//	{
//		System.out.println(l);
//	}
//	
//	
	tx.commit();
	}
	
	
	

}
