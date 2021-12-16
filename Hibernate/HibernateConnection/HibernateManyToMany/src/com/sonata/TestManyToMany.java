package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestManyToMany {
	
	public static void main(String args[]){
		  Delegate d1 = new Delegate();
		  d1.setDelegateName("Rajesh");
		  Delegate d2 = new Delegate();
		  d2.setDelegateName("Roopa");
		  Delegate d3 = new Delegate();
		  d3.setDelegateName("Rama");		  
		  
		Event j1 = new Event();
		j1.setEventName("JAVA");		
		Event h1 = new Event();
		h1.setEventName("Hibernate");		
		Event s1 = new Event();
		s1.setEventName("Spring");
		
		j1.getd1().add(d1);
		j1.getd1().add(d2);
		j1.getd1().add(d3);
		h1.getd1().add(d2);
		h1.getd1().add(d3);
		s1.getd1().add(d3);
		
		
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session see1 = factory.openSession();
		see1.beginTransaction();
		see1.save(j1);
		see1.save(h1);
		see1.save(s1);
		see1.save(d1);
		see1.save(d2);
		see1.save(d3);
		see1.getTransaction().commit();
	}

}
