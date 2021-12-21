package com.example.springdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.CalculatorInterface;
@Component
public class CalculatorImpl implements CalculatorInterface {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int s, int y) {
		
		return s-y;
	}

}
