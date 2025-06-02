package com.paras.Students;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App1 {
	public static void main(String[] args) {
		
		
		Laptop l=new Laptop();
		l.setLap_id(82);
		l.setName("asus2");
		
		student s=new student();
		s.setStud_id(1208);
		s.setName("aadi2");
		s.setMarks(99);
		
		Laptop l1=new Laptop();
		l1.setLap_id(191);
		l1.setName("hp2");
		
		Laptop l2=new Laptop();
		l2.setLap_id(91);
		l2.setName("dell2");
		
		student s1=new student();
		s1.setName("paras1");
		s1.setMarks(98);
		s1.setStud_id(113);
		s1.getLaptop().add(l);
		s1.getLaptop().add(l1);
		s1.getLaptop().add(l2);
	
		s.getLaptop().add(l);
		s.getLaptop().add(l1);
		s.getLaptop().add(l2);
		l1.getStud().add(s);
		l2.getStud().add(s);
		l.getStud().add(s);
		
		l1.getStud().add(s1);
		l2.getStud().add(s1);
		l.getStud().add(s1);
		
		
		
//		
		
		Configuration con=new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(student.class);
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(sr);
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		session.save(l);
		session.save(s);
		session.save(s1);
		session.save(l1);
		session.save(l2);
//		s=(student)session.get(student.class, 101);
//		System.out.println(s);
		
		ts.commit();
		
		
		
		
	}
}
