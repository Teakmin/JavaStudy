package com.sumgo.test;

import com.sumgo.child.Child;
import com.sumgo.parent.Parent;

public class PolymorphismTest3 {

	public static void main(String[] args) {
		Parent paNull = null;
		Child chNull = new Child();
	
		Child ch = new Child();
		Parent pc = new Child();
		Parent pa = new Parent();
		
		paNull = ch;
		// Object Casting    �θ� �׸��̸� �ڵ����� ĳ���� ��
		chNull =(Child) pc;  //�ڽ��� �׸��̸� ĳ���� ����ؾ���
//		chNull = (Child) pa;  //�̰� �ɸ��� �ֳ�. �θ�׸��� �ڽ� ��°�?
	}

}
