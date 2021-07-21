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
		// Object Casting    부모가 그릇이면 자동으로 캐스팅 됨
		chNull =(Child) pc;  //자식이 그릇이면 캐스팅 명시해야함
//		chNull = (Child) pa;  //이게 될리가 있냐. 부모그릇에 자식 담는게?
	}

}
