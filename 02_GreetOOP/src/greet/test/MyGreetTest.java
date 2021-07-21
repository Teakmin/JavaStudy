package greet.test;
/*
 * Mygreet 클래스의 메소드를 동작시키는 실행 클래스... TEst 클래스
 * Test 클래스 하는 일
 * 1. 클래스의 객체를 생성 == 식구(구성요소)드링 메모리에 올라간다.
 * 2. 접근
 * 		1) 필드 ---값 할당
 * 		2)메소드 --- 호출(Calling)
 */

import greet.MyGreet; //main이니까 import해서 출력하는 기능. import "package.class"순

public class MyGreetTest {

	public static void main(String[] args) {
		
		MyGreet mg = new MyGreet();  //인스턴스 mg 생성. MyGreet클래스에서 new를 붙인다.
		mg.sayHello("Sang-soon");
		

	}

}
