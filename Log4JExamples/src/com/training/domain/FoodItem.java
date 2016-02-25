package com.training.domain;

import java.util.List;

import org.apache.log4j.Logger;

public class FoodItem {
	
	Logger log =Logger.getRootLogger();
	
	private int itemCode;
	private String itemName;
	private double ratePerUnit;
	private boolean isVegetarian;
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	
	
	public FoodItem(int itemCode, String itemName, double ratePerUnit, boolean isVegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.isVegetarian = isVegetarian;
		log.info("Item set");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FooDItem  "+getItemCode()+"    ItemName  "+getItemName()+"   Rate  "+getRatePerUnit()+"\n";
	}

	
	
	
	

}
