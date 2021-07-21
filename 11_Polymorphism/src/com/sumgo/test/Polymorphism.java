package com.sumgo.test;

import com.sumgo.child.Child;
import com.sumgo.parent.Parent;

public class Polymorphism {

	public static void main(String[] args) {
		// instance of Ű����
		Parent pa = new Parent();
		System.out.println(pa instanceof Parent);//true
		System.out.println(pa instanceof Child);//false
	
		Parent pc = new Child();
		System.out.println(pc instanceof Parent); //true
		System.out.println(pc instanceof Child); //true
	}// instanceof�� �ؿ� �ִ°��� Ȯ��

}
