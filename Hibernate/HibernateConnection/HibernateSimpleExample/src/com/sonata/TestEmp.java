package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmp {

	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		 e1.setEmpId(10);
		 e1.setEmpName("shy");	 
		 e1.setEmpSal(2345);
		 e1.setEmailAdd("just@hot.com");
		 e1.setPassword("show");		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(e1);
		s1.getTransaction().commit();
		
		

	}

}
