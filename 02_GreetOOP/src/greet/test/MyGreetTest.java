package greet.test;
/*
 * Mygreet Ŭ������ �޼ҵ带 ���۽�Ű�� ���� Ŭ����... TEst Ŭ����
 * Test Ŭ���� �ϴ� ��
 * 1. Ŭ������ ��ü�� ���� == �ı�(�������)�帵 �޸𸮿� �ö󰣴�.
 * 2. ����
 * 		1) �ʵ� ---�� �Ҵ�
 * 		2)�޼ҵ� --- ȣ��(Calling)
 */

import greet.MyGreet; //main�̴ϱ� import�ؼ� ����ϴ� ���. import "package.class"��

public class MyGreetTest {

	public static void main(String[] args) {
		
		MyGreet mg = new MyGreet();  //�ν��Ͻ� mg ����. MyGreetŬ�������� new�� ���δ�.
		mg.sayHello("Sang-soon");
		

	}

}
