package array.test;

import java.util.Random;

public class ArraySortingTest3 {

	public static void main(String[] args) {
		int[] arr= {3, 5, 7, 4, 2, 1, 6};
		
		System.out.println("정렬 전: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		for (int i = 0; i < arr.length; i++) {                    //sorting(순서대로) 하는 법.! (작은게 앞에 있으면 새로운 temp에 저장해서 돌린다.)
			for (int j = 1; j < arr.length - i; j++) {            //순서대로 2개씩 비교해서 한바퀴 도는데 j 사용, 다 도는데 i 사용.
				int temp = 0;
				if (arr[j -1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k] + " ");
			}
				System.out.println("");
		}
	}
}
}