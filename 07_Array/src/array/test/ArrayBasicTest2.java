package array.test;
/* 
 * �迭�� ����, ����, �Ҵ��� �ѹ���
 * 
 * �迭�� Ư¡
 * 1. �迭�� resizing�� �� ����. (�������̴�.)
 * 		ó�� ���� ����� �����ϸ� 
 * 		���ο� �迭�� �ϳ� �����.
 * 
 * 2. �迭�� ��ü��.  (object Ÿ���̹Ƿ� Heap�� data�� ����)
 * 		new Ű���带 ���ؼ� ���� ... Heap�� �ö󰣴�.
 * 		������ Class Type�� �������� �ʴ´�.
 * 		length�� �ִ�.
 * 
 * 3. �迭�� resizing �ȵ����� 
 * 		����� �ٸ� �迭�� �����͸� �����ؿͼ� ����� �� �� �ִ�.
 *		System.arraycopy()�� ����Ѵ�. 
 */
public class ArrayBasicTest2 {

	public static void main(String[] args) {
		//1. �迭 ���� + ����, �Ҵ� �Ѳ�����
		int[] arr = {11, 22, 33};
		System.out.println(arr);
//		for (int i = 0; i < arr.length ; i++) System.out.println(arr[i]);
	
		System.out.println("\n===============");
		// 44, 55 �߰�
		arr = new int[5];
		arr[3] = 44;
		arr[4] = 55;
//		for (int i = 0; i < arr.length ; i++) System.out.println(arr[i]);
		
		System.out.println("\n======================Array Copy");
		int[] target = {1,2,3,4,5,6};
		int[] source = {10, 9,8,7,6,5,4,3,2,1};
	
		System.arraycopy(source, 6, target, 1, 4);
		for (int i = 0; i < target.length ; i++) System.out.println(target[i]);
	}

}
