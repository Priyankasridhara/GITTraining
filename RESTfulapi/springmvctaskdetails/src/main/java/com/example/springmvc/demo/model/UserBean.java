package com.example.springmvc.demo.model;

import java.util.Date;

public class UserBean {
	private int userId;
	private int ownerId;
	private int creatorid;
	private String name;
	private String email;
	private String description;
	private Date modifiedon;
	private Date createdOn;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public java.sql.Date getCreatedOn() {
		return (java.sql.Date) createdOn;
	}
	public void setCreatedOn(Date l) {
		this.createdOn = l;
	}
	public java.sql.Date getModifiedOn() {
		return (java.sql.Date) modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public int getCreatorid() {
		return creatorid;
	}
	public void setCreatorid(int creatorid) {
		this.creatorid = creatorid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public java.sql.Date getModifiedon() {
		return (java.sql.Date) modifiedon;
	}
	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}
	private Date modifiedOn;
	
}
