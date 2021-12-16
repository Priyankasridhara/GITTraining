package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	
	public static void main(String[] args) {
			
		 UserDetails u1 = new UserDetails();
		 u1.setUserName("shy");
		 
		 Vehicle v1 = new Vehicle();
		 v1.setVehicleName("car");
		 	//v1.setUserD(u1);	
		   u1.setVehicle(v1);
		   
		  SessionFactory factory= new Configuration().configure().buildSessionFactory();
			Session s1 = factory.openSession();
			s1.beginTransaction();
			s1.save(u1);
			s1.save(v1);
			s1.getTransaction().commit();

	}

}









