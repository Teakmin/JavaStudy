package collectionTest1;

import java.util.HashSet;

/*
 * Set�� �ڽ�... HashSet
 * 1. �ߺ� ���x
 * 2. ����x
 */
public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet();
		
		set.add("��ȣ��");
		set.add("�̼���");
		set.add("������");
		set.add("��ȣ��");
		set.add("����ö");
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		set.remove("������");

		System.out.println(set);
		
		set.clear();
		System.out.println(set);
	}

}
