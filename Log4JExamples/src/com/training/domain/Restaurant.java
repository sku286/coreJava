package com.training.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Restaurant {
	Logger log =Logger.getRootLogger();
	private List<FoodItem> item;
	/*private List<FoodItem> itemVeg;
	private List<FoodItem> itemNonVeg;*/
	FoodItem obj1,obj2,obj3,obj4;
	
	public Restaurant() {
		item = new ArrayList<FoodItem>();
		
		 obj1= new FoodItem(101, "Roti", 10, true);
		 obj2= new FoodItem(102, "daal", 50, true);
		 obj3= new FoodItem(103, "paneer", 150, true);
		 obj4= new FoodItem(104, "chicken", 200, false);
		// init();
	}
	public void init(){
		item.add(obj1);
		item.add(obj2);
		item.add(obj3);
		item.add(obj4);
		
	}
	public List<FoodItem> getItems(String type)
	{
		log.info("Type of Food");
		if(type.equals("vegetarian"))
			return item.subList(0, 3);
		else
			return item.subList(3, 4);
	}
	public List<FoodItem> setMenuCard()
	{	
		log.info("Returning Menu List");
		return item;
	}

}
