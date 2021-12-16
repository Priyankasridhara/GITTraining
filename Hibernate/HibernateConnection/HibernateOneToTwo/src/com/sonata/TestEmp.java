package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmp {

	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustName("shy");
		c1.setCustAddress("Bangalore");
		c1.setCreditScore(100);
		c1.setRewardPoint(100);
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(c1);
		s1.getTransaction().commit();
		
		

	}

}
