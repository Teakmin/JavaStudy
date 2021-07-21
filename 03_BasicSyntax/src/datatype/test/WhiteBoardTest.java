package datatype.test;

import datatype.WhiteBoard;

 /* 테스트 클래스가 하는 일
  * 1) 객체 생성.... 객체의 구성요소(식구(속성, 메소드))를 메모리에 올린다.
  * 2) 식구에 접근
  * 		필드 ---값 할당
  * 		메소드 --- calling
  */
public class WhiteBoardTest {
                                 //여기까지 field
	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();     //가져올 class + 인스턴스 = new + 클래스
		
		wb.setField(36, 'W', 115.5f, "삼성", true);  //인스턴스.method()
		System.out.println(wb.toString());
		
	}

}
