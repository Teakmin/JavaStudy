package sample;

public class MyStudent {
	
	public String name; //type적고 변수이름
	public int age;
	public String address;
	
	public void printInfo() { //void니까 return값이 없다.
		System.out.println(name + ", " + age + ", " + address);
	} /*	  
	   *중요한건 위의 String name이랑 여기 name이 다르다는 것!!!
	   *위에건 변수, 아래건 메소드의 임의 것.
	   */
	
}
