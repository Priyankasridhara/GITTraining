package com.sonata.dao;


import java.util.List;


import com.sonata.Task;

public interface TaskSystemDao {
	public boolean addTask(Task task) ;
	public List<Task>getData();
	List<Task> getAllTasks();
	Task getTask(int taskid);

}
