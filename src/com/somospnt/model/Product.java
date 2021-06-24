package com.somospnt.model;

import java.math.BigInteger;

public class Product implements Comparable<Product>{
	
	private Long id;
	private String name;
	private BigInteger price;
	
	public Product(String name, BigInteger price) {
		this.name = name;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getPrice() {
		return price;
	}
	public void setPrice(BigInteger price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Product product) {
		return this.getPrice().compareTo(product.getPrice());
	}
	

}
