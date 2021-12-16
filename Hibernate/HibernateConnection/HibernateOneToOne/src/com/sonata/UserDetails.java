package com.sonata;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue
 private int userId;
 private String userName;
 
@OneToOne(cascade=CascadeType.ALL, fetch =FetchType.EAGER) 
 @JoinColumn(name ="VEHICLE_ID")
 private Vehicle vehicle ;
 
 
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
 
 
}
