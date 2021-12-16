package com.sonata.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sonata.Student;

import antlr.collections.List;

public class StudentDAO {
	public Student getSudent(int id) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		Student stu2 =		(Student) s1.load(Student.class,2);
		s1.close();
		return stu2;
	}
	
	public List getStudents() {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		Query q = s1.createQuery("from Student");
		return (List) q.list();

	}
}
