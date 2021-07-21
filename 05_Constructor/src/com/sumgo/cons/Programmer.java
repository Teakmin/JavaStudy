package com.sumgo.cons;

import com.sumgo.util.MyDate;

public class Programmer {        //클래스가 programmer
	public String name;
	public String gender;
	public String lang;       
	public int career;
	public MyDate birthday;
	public String getAnnualSalary;
	
	public Programmer(String name, String gender, String lang, int career, MyDate birthday  ) {
		this.name = name;         //생성자(constructor) 이름이 programmer(클래스)와 똑같다는 점은 매우매우 중요함!!!!!!
		this.gender = gender;     //인자는 type과 매개변수 갖게 되어있고
		this.lang = lang;
		this.career = career;
		this.birthday= birthday;   //받은 인자 String name으로 전역변수의 값을 setting하는걸 이 메소드가 하는 것!
	}
	
	public String getInfo() {
		return name + "," + gender + "," + lang + "," + career + "," + birthday.getDate();
	}
	
	//개발자의 연봉을 리턴하는 기능
	public int getAnnualSalary() {
		return career * 1000;
		
	}

	public String getName() {
		return name;
	}
}


/*	클래스 이름이랑 생성자 이름이 똑같은 이유
 * 
 * Programmer라는 생성자가 클래스 이름인 Programmer랑 똑같은 이유는 
 * 생성자가 가장 먼저 어떤 메소드(생성자)를 실행해서 로직이 채워지면 
 * 그 로직은 어떠한 메소드보다도 
 * 먼저 실행되서 초기화 작업을 할 수가 있음. 
 * 
 * 만약 똑같은 이름이 없으면 만들게 되는거고 
 * 그게 기본생성자
 */