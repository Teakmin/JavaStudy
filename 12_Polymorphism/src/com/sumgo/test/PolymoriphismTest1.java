package com.sumgo.test;

import com.sumgo.child.Engineer;
import com.sumgo.child.Manager;
import com.sumgo.child.Secretary;
import com.sumgo.parent.Employee;
import com.sumgo.util.MyDate;

public class PolymoriphismTest1 {

	public static void main(String[] args) {
		// 클래스 잘 동작하나 확인
		Employee emp = new Employee("James", new MyDate(1982, 3, 2), 3000);
		Manager m = new Manager("Robert", new MyDate(1981, 4, 2), 3500, "Accounting");
		Engineer eg = new Engineer("Gosling", new MyDate(1978, 1, 2), 3500, "JAVA", 200);
		Secretary s = new Secretary("Peter", new MyDate(1988, 1, 2), 3400, "Robert");
//		Manager m = new Employee("James", new MyDate(1982, 3, 2), 3000);   //오류발생 (자식그릇에 부모가 들어갈 순 없다.)

		m.chageDept("Marketing");
		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(s.getDetails());
	
		//////// Polymorphism
		System.out.println("=====Polymorphism=====");
		
		Employee emp1 = new Manager("Robert", new MyDate(1981, 4, 2), 3500, "Accounting");
		Employee emp2 = new Engineer("Gosling", new MyDate(1978, 1, 2), 3500, "JAVA", 200);
		Employee emp3 = new Secretary("Peter", new MyDate(1988, 1, 2), 3400, "Robert");
		
		//virtual Method Invocation
		// 딱 한 경우 : 자식이 메서드 오버라이딩을 했을 때;
		// 컴파일 시점 - 부모의 메소드
		// 런타임 시점 - 자식의 메소드
		System.out.println(emp1.getDetails());
		System.out.println(emp2.getDetails());
		System.out.println(emp3.getDetails());
	
		//Object Casting
//		emp2.getBonus  // 안됨 (자식의 메서드잖아 override 상속된게 아니라)
		System.out.println(((Engineer) emp2).getBonus());  //Object Casting 이렇게 캐스팅해주자
	}

}