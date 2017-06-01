package com.affinity;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import com.affinity.facade.WorstFacade;

public class TestApp {

	public static void main(String[] args) {
		SeContainer container = SeContainerInitializer.newInstance().initialize();
		WorstFacade clazz = container.select(WorstFacade.class).get();
		System.out.println(clazz.getTheMessage());
		container.close();
	}

}
