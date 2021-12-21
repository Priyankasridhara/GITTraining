package com.example.springdemo.impl;

import org.springframework.stereotype.Component;

import com.example.springdemo.GreetingInterface;
@Component
public class Greeting implements GreetingInterface {

	@Override
	public String sayGreeting(String name) {
		return "Good morning " +name;
	}

}
