package exception.runtime.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		
		
		String str = null;
		try {
			System.out.println(str.length());
			System.out.println(1);
		}			catch(NullPointerException e) {
			System.out.println("��Ҵ�...");
		}	finally {//���� ��� ����(���ܰ� �߻��ϵ� ����) ������ �� �κ� ����}
			System.out.println("Always print...");
		}
		System.out.println("the end...");
	}

}
