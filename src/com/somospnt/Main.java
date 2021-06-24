package com.somospnt;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import com.somospnt.model.Cosmetic;
import com.somospnt.model.Drink;
import com.somospnt.model.Fruit;
import com.somospnt.model.Product;
import com.somospnt.utils.SortProduct;

public class Main {

	public static void main(String[] args) {
				
		List<Product> products = Arrays.asList(new Drink("Coca-Cola Zero", new BigInteger("20"), 1.5),
					 new Drink ("Coca-Cola", new BigInteger("18"), 1.5),
					 new Cosmetic("Shampoo Sedal", new BigInteger("19"), "500ml"),
					 new Fruit("Frutillas", new BigInteger("64"),"kilo"));
		
		SortProduct sortProduct = new SortProduct();
		sortProduct.sortProduct(products);

	}

}
