package com.example.springdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.CalculatorInterface;
import com.example.springdemo.Usecalculator;
@Component
public  class UseCalculatorImpl implements Usecalculator {
	
	@Autowired
	CalculatorInterface calculatorInterface;
	
	
	
	@Override
	public int useExpression( ) {
		int result=calculatorInterface.add(10, 12)+calculatorInterface.sub(10, 9);
		return result;
	}
	
	

}
