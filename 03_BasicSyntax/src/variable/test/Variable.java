package variable.test;
/*
 * 변수는 선언 위치에 따라서 필드와 지역변수로 나뉜다.
 *        필드(전역변수, 멤버변수)는                   지역변수
 *  위치   클래스 내부의 메소드 혹은 생성자 외부      메소드 혹은 생성자 내부
 *  사용   클래스 내부, 접근 제한자(public)    메소드 혹은 생성자 내부                      
 *  초기화 필드는 보통 초기화를 안 함                    초기화 해야 됨  (초기화 = 할당 "num = 3;")
 *  
 */
public class Variable {
	public static void main(String[] args) {
	int num;
	num = 3;
	int num2 = 2;
	System.out.println(num);
	
	}
}
