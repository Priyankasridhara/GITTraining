package com.example.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.impl.Greeting;
import com.example.springdemo.impl.UseCalculatorImpl;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		//GreetingInterface greet = new Greeting();
				//GreetingInterface greet = (GreetingInterface) ctx.getBean("greeting");
				//System.out.println(greet.sayGreeting("Sonata"));
		      //CalculatorInterface cal=(CalculatorInterface) ctx.getBean("calculatorImpl");
		      //System.out.println("FirstMethod: "+cal.add(30, 20));
		      Usecalculator cal1=(Usecalculator) ctx.getBean("useCalculatorImpl");
		      System.out.println("Result using Usecalculator:"+cal1.useExpression());
		    
				
				BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
				//GreetingInterface greet = new Greeting();
				ChristmasInterface greet = (ChristmasInterface) factory.getBean("christmasImpl");
				System.out.println(greet);
				System.out.println(greet.happyChristmas("Sonata"));
				
			
	}

}
