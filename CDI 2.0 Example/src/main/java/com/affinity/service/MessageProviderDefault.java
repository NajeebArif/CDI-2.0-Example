package com.affinity.service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

public class MessageProviderDefault implements MessageProviderService{
	
	@Inject Logger logger;
	
	public MessageProviderDefault(){}
	
	private String message;
	
	public String handOverTheMessage(){
		return message;
	}
	
	@PostConstruct
	public void constructTheMessage(){
		logger.info("Post Construct is Called.");
		this.message="Creating the Other Message Bro!!";
	}
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("Cleaning up the resources for MessageProvider");
	}

	public String getSomethingWillYou() {
		// TODO Auto-generated method stub
		return "Geting the Value: "+message;
	}
}
