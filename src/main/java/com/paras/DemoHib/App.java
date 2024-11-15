package com.paras.DemoHib;

import org.hibernate.Session;
import java.util.*;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )
    {
		Fullname fn = new Fullname();
		fn.setFname("Disha");
		fn.setMidname("Paras");
		fn.setLname("Yadav");
		
		
    	Alien1 telusko = new Alien1();
        telusko.setAid(105); // we don't need to set value for Aid bcoz its auto increment
        telusko.setAcolor("Cyan");
        telusko.setAname("Disha");
        telusko.setAddedDate(new Date());
        telusko.setX(999.99);
        telusko.setFname(fn);
    	
       
      
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien1.class);
       ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf = con.buildSessionFactory();
      
       Session session =sf.openSession();
       Transaction ts =session.beginTransaction();
       session.save(telusko);
    //   telusko = (Alien1) session.get(Alien1.class,3);
    
       ts.commit();
     //  System.out.println(telusko);   // here we are using toString method otherwise it will display Hashcode
        System.out.println("done..");
    }

	

}
