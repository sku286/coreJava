package com.training.apps;

import org.apache.log4j.Logger;

import com.training.domain.Restaurant;

public class Application {

	public static void main(String[] args) {
		
		Logger log =Logger.getRootLogger();
		log.info("Application Started");
		Restaurant obj = new Restaurant();
		obj.init();
		System.out.println(obj.setMenuCard());
		System.out.println(obj.getItems("nonvegetarian"));
		log.info("Application Completed");

	}

}
