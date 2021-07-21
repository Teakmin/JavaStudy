package sample.test;

import sample.MyStudent2;

/*
 * MyStudentTest.java의 문제점
 * :학생 수가 늘아날 때마다 일일이 필드에 값을 넣어줘야하는 번거로움이 있다.(세 줄 작성)
 * 프로그램은 작성시 실제 값이 하드코딩되어지면 안 된다.
 * 
 * 해결책
 * : 값이 필드에 입력되는 기능을 만들면 된다.
 */
public class MyStudent2Test {
								//여기까지가 field
	public static void main(String[] args) {
		MyStudent2 ms1 = new MyStudent2();
		MyStudent2 ms2 = new MyStudent2();
		
		
		ms1.setField("김택민", 27, "인천");
		ms2.setField("이상순", 25, "인천");

		ms1.printInfo();
		ms2.printInfo();
	}

}
