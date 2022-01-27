package com.example.springmvc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CaseStudyEmailnotificationApplication {
@Autowired
private  EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(CaseStudyEmailnotificationApplication.class, args);
	}

@EventListener(ApplicationReadyEvent.class)

public void sendMail() {
	
	senderService.sendEmail("priyankasridhara123@gmail.com", 
		                    "this is subject",
			                "this is body of email");
	
}
}
