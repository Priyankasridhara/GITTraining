package com.sonata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.cfg.Configuration;

@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;
	
	List<Delegate> d1 = new ArrayList<Delegate>();
	
	@ManyToMany
	@JoinTable(name ="Join_Delegate_Event",
	    joinColumns ={@JoinColumn(name ="eventId")} ,
	    inverseJoinColumns ={@JoinColumn(name ="delegateId")})
	public List<Delegate> getd1() {
		return d1;
	}
	public void setd1(List<Delegate> d1) {
		this.d1 = d1;
	}
	
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Configuration getD1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
