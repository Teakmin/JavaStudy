package com.sumgo.vo;
/*
 * 상품에 대한 정보를 갖고 있는 클래스
 * VO class : Value Object, 특정한 정보를 담고있는 클래스
 * 특정한 정보들:
 * 1.Field
 * 2.Constructor 생성자
 * 3.setter/getter  쓰고 가져오는거(read, write)
 * 4.toString  
 * 
 * field만 작성하면  shift + alt + s 를 통해 생성 가능하다.
 */
public class Product {
	private String name;
	private int price;
	private int quantity;
	private String company;

	public Product(String name, int price, int quantity, String company) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", company=" + company + "]";
	}  // toS



}
