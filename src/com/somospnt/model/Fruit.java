package com.somospnt.model;

import java.math.BigInteger;

public class Fruit extends Product{
	
	private String salesUnit;

	public Fruit(String name, BigInteger price, String salesUnit) {
		super(name, price);
		this.salesUnit = salesUnit;
	}

	public String getSalesUnit() {
		return salesUnit;
	}

	public void setSalesUnit(String salesUnit) {
		this.salesUnit = salesUnit;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "/// Price: $"+ this.getPrice()+ " /// Sales Unit: " + salesUnit;
	}	
	
	
}
