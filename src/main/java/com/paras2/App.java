package com.paras2;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
	public static void main(String[] args)
	{
		Configuration con = new Configuration().configure("hibernate2.cfg.xml").addAnnotatedClass(Alien.class);
		ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(sr);
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		Query q= session.createQuery("from Student where Name='disha' ");
		q.setCacheable(true);
		Alien a = (Alien)q.uniqueResult();
		
		//Alien a=(Alien)session.get(Alien.class,"disha" );
		System.out.println(a);
		session.getTransaction().commit();
		
		
		Session session1 = sf.openSession();
		session1.beginTransaction();
		Query q1 = session.createQuery("from Student where Name='disha'");
		q1.setCacheable(true);
		Alien a1 = (Alien)q1.uniqueResult();
		//Alien a1=(Alien)session1.get(Alien.class,"disha" );
		System.out.println(a1);
		session1.getTransaction().commit();
		//session.close();
		
				//for hibernate-core 5.6.9 and hibernate-ehcache 5.6.9 use echache 3x
		//for hibernate-core 4.1.6 and hibernate-ehcache 4.1.6 use echache 2x
	}

}
