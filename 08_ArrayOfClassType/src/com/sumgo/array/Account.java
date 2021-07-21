package com.sumgo.array;

public class Account {
	
	private int balance;                             //balance와 bankName이라는 필드 생성 (필드는 나만 쓸 수 있게 private 사용 )
	private String bankName;
	
	public Account(int balance, String bankName) {     //생성자로 Account 생성(클래스와 메소드(생성자 이름 동일), 생성자는 객체가 생성될 때 호출됨)
		this.balance = balance;
		this.bankName = bankName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getDetail() {
		return balance + ", " + bankName;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
}
