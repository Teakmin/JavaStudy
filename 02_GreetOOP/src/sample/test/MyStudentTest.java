package sample.test;
/*
 * 1. MyStudent ��ü�� ���� ...	ms + �ʵ� �ʱ�ȭ
 * 2. MyStudent�� �޼ҵ带 ȣ��
 */

import sample.MyStudent;

public class MyStudentTest {

	public static void main(String[] args) {
		//1. 
		MyStudent ms = new MyStudent();
		ms.name = "���ù�";
		ms.address = "��õ";
		// ���α׷��� �ϵ��ڵ��Ǿ�����... ��ü�� ������ ������ �� ���� �Ἥ ���� �ʱ�ȭ ����� ��
		
		//2.
		ms.printInfo();
		
	}

}
