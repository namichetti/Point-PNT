package com.somospnt.utils;

import java.util.Collections;
import java.util.List;

import com.somospnt.model.Product;

public class SortProduct{
	
	public void sortProduct(List<Product> products) {	
		products.forEach(product->System.out.println(product.toString()));
		Collections.sort(products);
		System.out.println("=============================");
		System.out.println("Cheaper product: "+ products.get(0).getName());
		System.out.println("More expensive product: "+ products.get(products.size()-1).getName());
	}

}
