package com.example.springdemo.model;

import java.sql.Date;

public class Task {
	private int taskId;
	private int ownerId;
	private int creatorId;
	private String taskName;
	private String status;
	private String priority;
	private String notes;
	private String isBookmarked;
	private Date createdOn;
	private Date statusChangedOn;
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
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getName() {
		return taskName;
	}
	public void setName(String name) {
		this.taskName = name;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
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
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getStatusChangedOn() {
		return statusChangedOn;
	}
	public void setStatusChangedOn(Date statusChangedOn) {
		this.statusChangedOn = statusChangedOn;
	}
	public void setTaskName(String string) {
		this.taskName = taskName;
		
	}
	
	

}
