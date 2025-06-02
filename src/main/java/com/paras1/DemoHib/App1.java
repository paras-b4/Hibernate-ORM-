package com.paras1.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Collection;
import java.util.List;


public class App1 
{
	public static void main(String[] str)
	{
	
	Configuration con = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
	ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf = con.buildSessionFactory(sr);
	Session session = sf.openSession();
	Transaction tx=session.beginTransaction();
	
//	Laptop laptop=new Laptop();
//	Student s=new Student();
//	s.setRollno(17);
//	s.setName("Paras150");
//	s.setMarks(92);
//	s.getLaptop().add(laptop);
//	session.save(s);
//
//	laptop.setLid(11);
//	laptop.setLname("Lenovo");
//	laptop.setS(s);
//	//laptop.getS.add(s);
//	
//	Laptop laptop1=new Laptop();
//	laptop1.setLid(118);
//	laptop1.setLname("Dell");
//	laptop1.setS(s);
//	session.save(laptop1);
//	
//	
//	session.save(laptop);
	// Fetch Eager and lazy  // if you want to use eager then mention in the 
	Student s1= (Student)session.get(Student.class,"Paras150");
//	     
	System.out.println(s1);
//	
	Collection <Laptop> laptop = s1.getLaptop();
	for(Laptop l: laptop)
	{
		
		System.out.println("Laptop are : "+l);
		
	}
	Laptop l=(Laptop)session.get(Laptop.class, 111);
	System.out.println(l);
	Student s2=l.getS();
	System.out.println(s2);
//	
//	
	tx.commit();
	}
	
	
	

}
