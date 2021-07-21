package com.sumgo.cons;

import com.sumgo.util.MyDate;

public class Programmer {        //Ŭ������ programmer
	public String name;
	public String gender;
	public String lang;       
	public int career;
	public MyDate birthday;
	public String getAnnualSalary;
	
	public Programmer(String name, String gender, String lang, int career, MyDate birthday  ) {
		this.name = name;         //������(constructor) �̸��� programmer(Ŭ����)�� �Ȱ��ٴ� ���� �ſ�ſ� �߿���!!!!!!
		this.gender = gender;     //���ڴ� type�� �Ű����� ���� �Ǿ��ְ�
		this.lang = lang;
		this.career = career;
		this.birthday= birthday;   //���� ���� String name���� ���������� ���� setting�ϴ°� �� �޼ҵ尡 �ϴ� ��!
	}
	
	public String getInfo() {
		return name + "," + gender + "," + lang + "," + career + "," + birthday.getDate();
	}
	
	//�������� ������ �����ϴ� ���
	public int getAnnualSalary() {
		return career * 1000;
		
	}

	public String getName() {
		return name;
	}
}


/*	Ŭ���� �̸��̶� ������ �̸��� �Ȱ��� ����
 * 
 * Programmer��� �����ڰ� Ŭ���� �̸��� Programmer�� �Ȱ��� ������ 
 * �����ڰ� ���� ���� � �޼ҵ�(������)�� �����ؼ� ������ ä������ 
 * �� ������ ��� �޼ҵ庸�ٵ� 
 * ���� ����Ǽ� �ʱ�ȭ �۾��� �� ���� ����. 
 * 
 * ���� �Ȱ��� �̸��� ������ ����� �Ǵ°Ű� 
 * �װ� �⺻������
 */