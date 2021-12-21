package com.example.springdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.GreetingInterface;


public class ChristmasImpl implements com.example.springdemo.ChristmasInterface {


		
		GreetingInterface greeting;
		
		@Override
		public String happyChristmas(String message) {
			
			return greeting.sayGreeting(message);
	}

		public void setGreeting(GreetingInterface greeting) {
			this.greeting = greeting;
		}

}
