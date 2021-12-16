package com.sonata.jobtracker;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sonata.jobtracker.dao.impl.JobTrackerDaoImpl;
import com.sonata.jobtracker.model.Task;
public class Main {
	public static void main(String args[])
	{
		Task t1=new Task();
		t1.setOwnerId(21);
		t1.setCreatorId(287);
		t1.setName("Hema");
		t1.setTaskId(234);
		t1.setPriority("low");
		t1.setDescription("junit");
		t1.setNotes("available");
		t1.setStatus("completed");
		
		
		JobTrackerDaoImpl dao=new JobTrackerDaoImpl();
	
		
		int row=dao.save(t1);
		System.out.println(row);
		List<Task>list=dao.getData();
		for(Task t:list)
			System.out.println(t.getTaskId());
			Task t = null;
			System.out.println(t.getName());
			System.out.println(t.getNotes());
			System.out.println(t.getOwnerId());
			System.out.println(t.getPriority());
			System.out.println(t.getStatus());
			System.out.println(t.getDescription());
			System.out.println(t.getCreatorId());
			
		}
		
		
		
		}
		
	

