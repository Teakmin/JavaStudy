package exception.runtime.test;

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		
		String[] str = {
				"Hello Java",
				"Nice to meet you.",
				"How are you?"
		};
		
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(str[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch!");
			}
		}
		System.out.println("the end...");
	}

}
