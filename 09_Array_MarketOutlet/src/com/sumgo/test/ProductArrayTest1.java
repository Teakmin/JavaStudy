package com.sumgo.test;

import com.sumgo.service.ProductStoreService;
import com.sumgo.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		Product[] pros = {
			new Product("���׸�", 3000, 1, "��������"),
			new Product("����",1000000, 1, "Asus"),
			new Product("����",3000, 2, "zetstream")
		};
		
		ProductStoreService service = new ProductStoreService(); 
		
		System.out.println(service.getProductByName(pros, "����"));

	}

}
