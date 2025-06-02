package com.paras.Laptops;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.paras.Alien.Alien;

public class App2 {

	public static void main(String [] args) {
		
		Laptop l=new Laptop();
		l.setLid(1018);
		l.setLname("dell1");
		l.setPrice(100000);
	
		
		Laptop l1=new Laptop();
		l1.setLid(1019);
		l1.setLname("hp1");
		l1.setPrice(15000);
		
//		Alien1 a=new Alien1();  // in (one_to_many and many_to_one ) we can only add one alien at a time and can have multiple laptops .
//		a.setAlienid(115);
//		a.setAname("disha1");
//		a.getLaptop().add(l);
//		a.getLaptop().add(l1);
//		l.setAlien(a); // this is important to set foreign key .
//		l1.setAlien(a);
		
		Alien1 a1=new Alien1();
		a1.setAlienid(118);
		a1.setAname("disha2");
		a1.getLaptop().add(l);
		a1.getLaptop().add(l1);
		l.setAlien(a1);
		l1.setAlien(a1);
		 Configuration con=new Configuration().configure().addAnnotatedClass(Alien1.class).addAnnotatedClass(Laptop.class);
	        ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	        SessionFactory sf=con.buildSessionFactory(sr);
	        Session session=sf.openSession();
	        Transaction ts=session.beginTransaction();
	        
	        session.save(l);
	        session.save(l1);
	        session.save(a1);
//	        session.save(a);
	        // get vs load // get immediately fire the query .
	        // get = get method fire the query and store the object into the refrence variable  and the use this variable to get result .it will return null if object is not in database .
	        // load = load only fires the query only if it is required or we are using it .it will throw exception if object is not found in db .
//	        a= (Alien1)session.get(Alien1.class, 1);
//	        System.out.println(a);
//	        
//	        a = (Alien1)session.load(Alien1.class, 4);
//	        System.out.println(a); // here we are using reterived object .
	        ts.commit();
	}
}
