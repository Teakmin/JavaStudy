package exam.test;
/*Modifier --> Access Modifier | Usage Modifier
 * Usage Modifier : static, final, abstract
 * ��� ǥ���� �� static + final�� ���
 * 
 * final : "���� �������̾�"�� �Ǹ��ϴ� Ű����
 * final + ���� --> "���� ������ ������"--> ��� ����, ���Ҵ�(����) ����
 * final + Ŭ���� --> "���� ������ Ŭ������" --> �ܸ� ���, �� ���̻� ����� ����
 * final + �޼ҵ� --> "���� ������ �޼ҵ��" --> �������̵� ����
 */
class A {
	public static final int BASE_SALARY = 300; // ����� ������ �̸��� ��� �빮��&����� ���
	public final String test() {
		return "Overriding ����";
	}
}

final class B {
	
}

//class C extends A {
//	public String test() {
//		
//	}                            // final + �޼ҵ� == �������̵� ����
//}

//class D extends B{
//	
//}    final + Ŭ���� == ���̻� ��� ����

public class StaticExamTest4 {

	public static void main(String[] args) {
		

	}

}
