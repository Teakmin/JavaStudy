package sample.test;

import sample.MyStudent2;

/*
 * MyStudentTest.java�� ������
 * :�л� ���� �þƳ� ������ ������ �ʵ忡 ���� �־�����ϴ� ���ŷο��� �ִ�.(�� �� �ۼ�)
 * ���α׷��� �ۼ��� ���� ���� �ϵ��ڵ��Ǿ����� �� �ȴ�.
 * 
 * �ذ�å
 * : ���� �ʵ忡 �ԷµǴ� ����� ����� �ȴ�.
 */
public class MyStudent2Test {
								//��������� field
	public static void main(String[] args) {
		MyStudent2 ms1 = new MyStudent2();
		MyStudent2 ms2 = new MyStudent2();
		
		
		ms1.setField("���ù�", 27, "��õ");
		ms2.setField("�̻��", 25, "��õ");

		ms1.printInfo();
		ms2.printInfo();
	}

}
