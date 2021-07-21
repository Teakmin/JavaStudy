package greet;

/*
 * MyGreet 클래스는 콘솔창으로 출력하는 기능을 갖고 있는 클래스...
 */
public class MyGreet {
	
	public String message = "안녕하세요^^";//Field
	
	public void sayHello(String name) {//Method
		System.out.println(message + ", " + name);
	}

} // return값이 없을 때 void라는 타입 입력
