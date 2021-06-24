package com.somospnt.model;

import java.math.BigInteger;

public class Cosmetic extends Product{
	
	private String content;


	public Cosmetic(String name, BigInteger price, String content) {
		super(name, price);
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Name: "+ this.getName()+ " /// Content: " + content + " /// Price: $" + this.getPrice();
	}
	
	
}
