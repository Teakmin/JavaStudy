package loop.test;

import java.util.Scanner;

public class LoopingTest1 {

	public static void main(String[] args) {
		int[] odds = {1, 3, 5, 7, 9};
		//for������ ��� ���� ���
		for (int i = 0; i < odds.length; i++) {
			System.out.println(i + ", " + odds[i]);
		}
		//while������ ��� ���� ���
		int i = 0;
		while (i < odds.length) {
			System.out.println(i + ", " + odds[i++]);
		}
		
	}

}
