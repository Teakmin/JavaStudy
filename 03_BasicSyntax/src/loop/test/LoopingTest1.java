package loop.test;

import java.util.Scanner;

public class LoopingTest1 {

	public static void main(String[] args) {
		int[] odds = {1, 3, 5, 7, 9};
		//for문으로 모든 원소 출력
		for (int i = 0; i < odds.length; i++) {
			System.out.println(i + ", " + odds[i]);
		}
		//while문으로 모든 원소 출력
		int i = 0;
		while (i < odds.length) {
			System.out.println(i + ", " + odds[i++]);
		}
		
	}

}
