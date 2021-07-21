package com.sumgo.encapsulation;
/*
 * Encapsulation Pattern
 * 1. 필드는 다른 클래스에서 직접 접근하지 못하도록
 * 필드 앞에는 private
 * 2. 클래스의 읽기 쓰기 권한을 getter/ setter 
 * 	   + 추가적인 메소드
 * 	  메소드 앞에는  public(어디서든 쓰게)
 * 
 *
 */
public class MyDate {
	
	private int month;   //나만 입력시킬거니까 private  밑에 것들은 어떠한 권한들              밑에 설계한 걸로 한번 생각해보면 month에 0이 들어갈 수 있는지 생각해 봐!!(필드에 int를 선언하면 기본값인 0이 들어가니까)
	private int day;
	
	
	public int getMonth() {   //꺼내오는거 int
		return month;
	}
	public void setMonth(int month) {   //입력만 하는거지  return type없는 -> void사용
		if (month >= 1 && month <= 12) {
		this.month = month;
		} else {
			System.out.println("1부터 12까지 입력해주세요.");
			// 프로그램들 빠져나온다.
			System.exit(0);
		}
	}
	public int getDay() {
			return day;
	}
	public void setDay(int day) {
		switch(month) {
		case 2:
			if (day >= 1 && day <=28) {
		this.day = day;
		} else {
			System.out.println(month + "월 입니다. 1부터 28까지 입력해주세요.");
			System.exit(0);
		}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day >= 1 && day <=30) {
		this.day = day;
		} else {
			System.out.println(month + "월 입니다. 1부터 28까지 입력해주세요.");
			System.exit(0);
		}
			break;
		default:
			if (day >= 1 && day <=31) {
		this.day = day;
		} else {
			System.out.println(month + "월 입니다. 1부터 28까지 입력해주세요.");
			System.exit(0);
			
		}
	}
	
	}
	}
