package com.example.springmvc.demo.model;

import java.util.Date;

public class Task {
	private int taskId;
	private int ownerId;
	private String taskname;
	private String description;
	private String status;
	private int priority;
	private String notes;
	private String isBookmarked;
	private int creatorId;
	private Date createdOn;
	private Date modifiedOn;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public String getIsBookmarked() {
		return isBookmarked;
	}
	public void setIsBookmarked(String isBookmarked) {
		this.isBookmarked = isBookmarked;
	}
	public java.sql.Date getCreatedOn() {
		return (java.sql.Date) createdOn;
	}
	public void setCreatedOn(Date string) {
		this.createdOn = string;
	}
	public java.sql.Date getmodifiedOn() {
		return (java.sql.Date) modifiedOn;
	}
	public void setmodifiededOn(Date string) {
		this.modifiedOn = string;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

}
