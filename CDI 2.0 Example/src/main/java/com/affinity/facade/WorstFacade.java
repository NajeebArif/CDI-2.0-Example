package com.affinity.facade;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.affinity.qualifiers.Implementation2;
import com.affinity.service.MessageProviderService;

public class WorstFacade {
	
	@Inject private Logger logger;
	
	public WorstFacade(){}
	
	@Inject @Implementation2
	private MessageProviderService provider;
	
	@Inject @Default
	private MessageProviderService defaultProvider;
	
	private String message;
	
	public String getTheMessage(){
		logger.fine("Called the method for getting the final Constructed Message");
		return "Hello World From The WorstFacade.class and the message"+message+"\nSome Random String from Implemantation2: "+provider.getSomethingWillYou()+"\nAnother Random String from default Implemntation: "+defaultProvider.getSomethingWillYou();
	}
	
	@PostConstruct
	public void setTheMessage(){
		logger.fine("POST CONSRUCT METHOD FOR TEST CLASS IS CALLED.");
		this.message = "Whats up buddy!!!";
	}

}
