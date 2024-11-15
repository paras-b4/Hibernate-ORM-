package com.paras2;

import java.util.List;

import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App1 
{
	public static void main (String [] args)
	{

		Configuration con = new Configuration().configure("hibernate4.cfg.xml").addAnnotatedClass(Alien1.class).addAnnotatedClass(Names.class);
		ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(sr);
		
		Session session = sf.openSession();
		session.beginTransaction();
		
//		Query q=session.createQuery("from PARAS where marks > 80 ");
//		List<Alien1>  a = q.list();
//		for(Alien1 A : a )
//		System.out.println(A);
//		System.out.println();
//		Query q1=session.createQuery("from PARAS where Rollno= 35");
//		Alien1 p=(Alien1)q1.uniqueResult();
//		System.out.println(p);
//		System.out.println();
//		Query q2=session.createQuery("select Name,Rollno,Marks from PARAS where Rollno= 35");
//		Object[] p2=(Object[])q2.uniqueResult();
//		System.out.println(p2[0]+" : "+p2[1]+" : "+p2[2]);
		
		
		
//		Random r =new Random();
//		Names n=new Names();
//		
//		
//		for(int i=1;i<=50;i++)
//		{
//			String s=n.name();
//			Alien1 A = new Alien1();
//			A.setName(s);
//			A.setRollno(i);
//			A.setMarks(r.nextInt(100));
//			
//			session.save(A);
//		}
//		
		
		
		session.getTransaction().commit();
		
		
		
		
	}

}
