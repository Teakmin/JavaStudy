package exam.test;
// static initialization block...
// 초기화
public class StaticExamTest3 {
	static int i = 0;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method static block..." + i);
	}
	static {
		i = 300;
		System.out.println("static initialization block..." + i);	//얘가 먼저 실행된다. 끝 몰라도 됨.
	}
}
