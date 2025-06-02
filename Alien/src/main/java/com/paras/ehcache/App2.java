package com.paras.ehcache;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.paras.Alien.Alien;
import com.paras.Laptops.Alien1;

public class App2 {
	public static void main(String [] args) {
		
			Alien2 a=new Alien2();
			a.setAlienid(3);
			a.setAname("aadi");
			a.setAcolor("green");
		
		 	Configuration con=new Configuration().configure("hibernate4.cfg.xml").addAnnotatedClass(Alien2.class);
	        ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	        SessionFactory sf=con.buildSessionFactory(sr);
	        
	        // first-level-cache
	        
//	        Session session=sf.openSession();
//	        Transaction t=session.beginTransaction();
//	       // session.save(a);
//	        a=(Alien2)session.get(Alien2.class, 1);
//	        System.out.println(a);
//          
//            
//            a=(Alien2)session.get(Alien2.class, 1);
//	        System.out.println(a);
//            t.commit();
//	        
	        // second-level-cache .
	        
//	        Session session1=sf.openSession();
//	        Transaction ts=session1.beginTransaction();
//	        a=(Alien2)session1.get(Alien2.class, 1);
//	        System.out.println(a);
//	        ts.commit();
//	        
//	        Session session2=sf.openSession();
//	        Transaction ts1=session2.beginTransaction();
//	        a=(Alien2)session2.get(Alien2.class, 1);
//	        System.out.println(a);
//	        ts1.commit();
	        
	        // HQL also work with cache 
	        
	        Session session =sf.openSession();
	        session.beginTransaction();
	        Query q=session.createQuery("from Alien2 where Aname='aadi'");
	        q.setCacheable(true);
	        a=(Alien2) q.uniqueResult();
	        System.out.println(a);
	        session.getTransaction().commit();
	        
	        
	        Session session1 =sf.openSession();
	        session1.beginTransaction();
	        Query q1=session1.createQuery("from Alien2 where Aname='aadi'");
	        q1.setCacheable(true);
	        a=(Alien2) q1.uniqueResult();
	        System.out.println(a);
	        session1.getTransaction().commit();
	        // her we can use second level cache with hql .
//	        Why Doesn't Second-Level Cache Work with HQL?
//	        Second-Level Cache stores entities by their primary key.
//	        HQL queries do not fetch data by primary key directly; instead, they generate SQL queries dynamically.
//          But second level cache work with HQL by setting the entity as cacheable and set the cache and and do other configuration in xml file and set the cacheable(True)
//	        When you use session.createQuery("FROM Employee WHERE name = 'John'"), Hibernate bypasses the cache and directly hits the database.
//	        Only direct session.get() or session.load() methods use second-level cache.
	        

	        
	}
}
