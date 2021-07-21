package com.sumgo.test;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.sumgo.service.OutletStoreService;
import com.sumgo.vo.Customer;
import com.sumgo.vo.Product;

public class ProductArrayTest3 {

	public static void main(String[] args) {
		OutletStoreService service = new OutletStoreService();
		
		Product[] pros1 = {
				new Product("����û�ұ�", 70, 1, "LG"),
				new Product("������", 100,1, "SAMSUNG" ),
		};
		Product[] pros2 = {
				new Product("�����", 1, 3, "���"),
				new Product("�̰����ڵ��׽�Ʈ��", 1,2, "�Ѻ�" )
		};
		
		Customer c1 = new Customer(111, "�̻��", "����Ȧ��", pros1);
		Customer c2 = new Customer(222, "���ù�", "������", pros2);
		Customer[] cList = {c1, c2};
		
		for (Product p : service.getProductsByName(cList, "�̻��")) {
			System.out.println(p);
		}
		for (Product p: service.getProductsByPrice(cList, 1, 70)) {
			if (p != null) System.out.println(p);
		}
		
		
		
	}
}
/* pros1���� ����û�ұ�, ������
 * pros2���� �����, �̰����ڵ� 
 * c1���� �̻��
 * c2���� ���ù�
 * Customer[]�� c1, c2�ְ�
 * 
 */
 

