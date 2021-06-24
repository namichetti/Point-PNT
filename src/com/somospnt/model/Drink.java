package com.somospnt.model;

import java.math.BigInteger;

public class Drink extends Product {
	
	private double litres;

	public Drink(String name, BigInteger price, double litres) {
		super(name, price);
		this.litres = litres;
	}
	
	public double getLitres() {
		return litres;
	}

	public void setLitres(Float litres) {
		this.litres = litres;
	}

	@Override
	public String toString() {
		return "Name: "+ this.getName() + " /// Litres: " + litres + " /// Price: $" + this.getPrice();
	}

	
	
}
