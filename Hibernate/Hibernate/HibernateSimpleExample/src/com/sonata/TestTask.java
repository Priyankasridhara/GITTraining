package com.sonata;

import com.sonata.dao.impl.taskDaoImpl;

public class TestTask {
	public static void main(String[] args) {
		Task  t=new Task();
		taskDaoImpl ti=new taskDaoImpl();
		t.setTaskId(1000);
		t.setOwnerId(5000);
		t.setCreatorId(3000);
		t.setName("Create a DAO");
		t.setDescription("Create a class for Task");
		t.setStatus("completed");
		t.setPriority("high");
		t.setNotes("absnms");
		
		
	    
		ti.addTask(t);
	}

}
