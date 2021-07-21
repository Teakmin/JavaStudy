package com.sumgo.array;

public class Customer {
	
	private String name;
	private int ssn;
	private Account[] accs;
	
	public Customer(String name, int ssn) {              //ssn은 생년월일
	this.name = name;
	this.ssn = ssn;
	
	}
	
	public void setAccs(Account[] accs) {
		this.accs = accs;
	}

	public Account[] getAccs() {
		return accs;
	}
	
	public String getCustomerInfo() {
		String accsDetail = "";
		for (Account a : accs) {
			accsDetail += a.getDetail();
		}
		return name + ", " + ssn +", "+ accsDetail;
	}
	
	
}
