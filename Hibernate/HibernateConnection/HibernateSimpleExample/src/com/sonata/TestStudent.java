package com.sonata;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sonata.dao.StudentDAO;

public class TestStudent {

	
	public static void main(String[] args) {
		Student s=  new Student();
		s.setStdId(200);
		s.setStdName("Shashank");
		SessionFactory f =new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		
		
		//List l = (ArrayList) dao.getStudents();
		//System.out.println(l.size());
	}

}
