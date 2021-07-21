package loop.test;

import java.util.ArrayList;
import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		//999를 입력할 때까지 자연수를 입력 받아서 내용을 출력

		Scanner sc= new Scanner(System.in);
//		int score = sc.nextInt();
//		ArrayList<int> Nums = new ArrayList<int>();
//		while (score != 999) {
//			Nums.add(score);
//			continue;
//		}
//		System.out.println(Nums);
//	
		int n = 0;
		do {
			n = sc.nextInt();
			System.out.println(n);    //do는 무조건 시작하고 999인지 보고 while체크
		}while (n!=999);
		
		
		
	}

}
