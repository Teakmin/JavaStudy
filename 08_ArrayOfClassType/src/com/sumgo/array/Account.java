package com.sumgo.array;

public class Account {
	
	private int balance;                             //balance�� bankName�̶�� �ʵ� ���� (�ʵ�� ���� �� �� �ְ� private ��� )
	private String bankName;
	
	public Account(int balance, String bankName) {     //�����ڷ� Account ����(Ŭ������ �޼ҵ�(������ �̸� ����), �����ڴ� ��ü�� ������ �� ȣ���)
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
