package com.affinity.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class Loggers {

	public Loggers() {
		super();
	}
	
	@Produces private Logger getLogger(InjectionPoint injectionPoint){
		Logger logger = Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getSimpleName());
		logger.setLevel(Level.ALL);
		return logger;
	}
}
