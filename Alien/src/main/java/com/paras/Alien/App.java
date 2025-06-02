package com.paras.Alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class App 
{
    public static void main( String[] args )
    {
    	
//    	FullName f=new FullName();
//    	f.setFname("paras");
//    	f.setMname("singh");
//    	f.setLname("yadav");
        Alien a=new Alien();
     //   a.setAlienid(1);
//        a.setname(f);
//        a.setColor("white");
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
        ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory(sr);
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
//        session.save(a);
        a=(Alien)session.get(Alien.class, 2);
        System.out.println(a);
        ts.commit();
        
       
    }
}
