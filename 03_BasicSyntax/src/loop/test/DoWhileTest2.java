package loop.test;

import java.util.ArrayList;
import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		//999�� �Է��� ������ �ڿ����� �Է� �޾Ƽ� ������ ���

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
			System.out.println(n);    //do�� ������ �����ϰ� 999���� ���� whileüũ
		}while (n!=999);
		
		
		
	}

}
