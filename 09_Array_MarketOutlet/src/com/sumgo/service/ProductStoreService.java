package com.sumgo.service;

import com.sumgo.vo.Product;

public class ProductStoreService {

	public Product getProductByName(Product[] pros, String name) {
		for (Product p : pros) {
			if(p.getName().equals(name)) return p;             //StringÀº == ¾ø´Ù. equals
		}
		return null;
	}
	public Product[] getProductGTEPrice(Product[] pros, int price) {
		Product[] returnPros = new Product[3];
		int idx = 0;
		for (Product p: pros) {
			if(p.getPrice() >= price) returnPros[idx++] = p;			
		}
		return returnPros;
		
	}
	// getTotalPrice
	public int getTotalPrice( Product[] pros) {
		int total = 0;
		for (Product p: pros) total += p.getPrice() * p.getQuantity();
		return total;
	}
}
