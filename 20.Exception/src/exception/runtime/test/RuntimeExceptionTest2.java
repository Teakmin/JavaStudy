package exception.runtime.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		
		
		String str = null;
		try {
			System.out.println(str.length());
			System.out.println(1);
		}			catch(NullPointerException e) {
			System.out.println("잡았다...");
		}	finally {//위와 상관 없이(예외가 발생하든 말든) 무조건 이 부분 수행}
			System.out.println("Always print...");
		}
		System.out.println("the end...");
	}

}
