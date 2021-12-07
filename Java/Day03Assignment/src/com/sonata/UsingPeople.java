package com.sonata;


public class UsingPeople {
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	private String pName;
	
	Address obj;

	@Override
	public String toString() {
		return "UsingPeople [pName=" + pName + ", obj=" + obj + ", getpName()=" + getpName() + ", getObj()=" + getObj()
				+ "]";
	}



	

}
