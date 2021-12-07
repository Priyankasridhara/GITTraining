package com.sonata;

public  class Address extends Employee{
	//Door No, Street, City and Pin Code 

	
		  private String street;
		  private String city;
		  private String doorNo;
		  private String zip;
		 
		 
		  public Address() {
		  String addressStreet = null;
		street = addressStreet;
		  String addressCity = null;
		city = addressCity;
		  String addressDoorNo = null;
		doorNo = addressDoorNo;
		  String addressZip = null;
		zip = addressZip;
		 
		}


		public String getStreet() {
			return street;
		}


		public void setStreet(String street) {
			this.street = street;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getDoorNo() {
			return doorNo;
		}


		public void setDoorNo(String doorNo) {
			this.doorNo = doorNo;
		}


		public String getZip() {
			return zip;
		}


		public void setZip(String zip) {
			this.zip = zip;
		}


		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", doorNo=" + doorNo + ", zip=" + zip + "]";
		}


		public void setDoorNo1(String doorNo2) {
			// TODO Auto-generated method stub
			
		}


		public void setDoorN1(String doorNo2) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public float calculateSalary() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		}



