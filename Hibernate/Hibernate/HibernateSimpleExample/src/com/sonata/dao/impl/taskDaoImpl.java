package com.sonata.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import com.sonata.Student;
import com.sonata.Task;
import com.sonata.dao.TaskSystemDao;

public class taskDaoImpl implements TaskSystemDao{
	
	@Override
	public boolean addTask(Task task) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
	    
		
		s1.beginTransaction();
		Task  t=new Task();
		s1.save(t);
		s1.getTransaction().commit();
		return true;
	}

	@Override
	public List<Task> getData() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public void addTask1(Task t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getTask(int taskid) {
		// TODO Auto-generated method stub
		return null;
	}



}
