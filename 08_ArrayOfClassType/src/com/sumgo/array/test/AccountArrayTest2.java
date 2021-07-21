package com.sumgo.array.test;

import com.sumgo.array.Account;
import com.sumgo.array.Customer;

public class AccountArrayTest2 {

	public static void main(String[] args) {
		Customer c =new Customer("±Ë≈√πŒ", 20010208);
		System.out.println(c.getAccs());
		
		Account[] accs = {
				new Account(100, "Ω≈«—"),
				new Account(200, "±ππŒ"),
				new Account(300, "øÏ∏Æ")
		};
		c.setAccs(accs);
		System.out.println(c.getAccs());
		
		System.out.println(c.getCustomerInfo());

	}
}

