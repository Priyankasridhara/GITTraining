package com.sonata;



public class CustomException {
	

		static int yearlySal=100000;
		
	public static void main(String args[]) throws MyOwnException {
			
			try {
				if(yearlySal<=100000) {
				throw new MyOwnException("The balance is not sufficient"); }
				else {
				System.out.println("sufficient balance");
				}
			} catch (MyOwnException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}


