package com.sonata.Task;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sonata.TaskBean.Task;
public class TestTracker {
	public static void main(String[] args) {
		//MySQLConnection con=new MySQLImp() ;
		//con.getConnection();	
		//System.out.println(con);
		Task t =  new Task();
		t.setTaskId(1000);
		t.setOwnerId(5000);
		t.setCreatorId(3000);
		t.setName("Create a DAO");
		t.setDescription("Create a class for Task");
		t.setStatus("completed");
		t.setPriority("high");
		t.setNotes("absnms");
		

}
}