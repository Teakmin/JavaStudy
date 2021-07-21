package com.sumgo.cons;

/*
 * 1.생성자
 *  객체를 생성할 때 사용하는 것. 내가 만듬.
 * 2. 기본생성자 public Shirt() {}
 *  인자 값 없고 
 *  아무런 동작도 하지 않는다. 컴이 만듬
 */
public class Shirt {
	
	public String brandName;
	public int price;
	public boolean longSleeved;              //필드
	
	public Shirt(String brandName, int price, boolean longSleeved) {            //생성자
		this.brandName = brandName;
		this.price = price;
		this.longSleeved = longSleeved;
	}
	public String getDetails() {
		return brandName + ", " + price + ", " + longSleeved;
	}
}
