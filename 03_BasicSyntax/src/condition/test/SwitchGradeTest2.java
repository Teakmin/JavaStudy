package condition.test;

import java.util.Scanner;

public class SwitchGradeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� ������ �Է��ϼ���>>>");
		int score = sc.nextInt();
		
		switch ((int) (score-1) / 10) {			
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
		 	System.out.println("C");
		 default:
			 System.out.println("Try Again");
			 break;
			
		}

	}

}
