package exam.test;
// static initialization block...
// �ʱ�ȭ
public class StaticExamTest3 {
	static int i = 0;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method static block..." + i);
	}
	static {
		i = 300;
		System.out.println("static initialization block..." + i);	//�갡 ���� ����ȴ�. �� ���� ��.
	}
}
