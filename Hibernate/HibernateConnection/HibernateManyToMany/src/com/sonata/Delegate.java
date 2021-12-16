package com.sonata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {
	
	@Id
	@GeneratedValue
    private int delegateId;
    private String delegateName;    
    
    List<Event> e1 = new ArrayList<Event>();
    
	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	@ManyToMany
	@JoinTable(name ="Join_Delegate_Event",
    joinColumns ={@JoinColumn(name ="delegateId")} ,
    inverseJoinColumns ={@JoinColumn(name ="eventId")})
	public List<Event> getE1() {
		return e1;
	}
	public void setE1(List<Event> e1) {
		this.e1 = e1;
	}   
    
}
