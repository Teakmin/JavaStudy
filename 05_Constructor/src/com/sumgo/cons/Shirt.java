package com.sumgo.cons;

/*
 * 1.������
 *  ��ü�� ������ �� ����ϴ� ��. ���� ����.
 * 2. �⺻������ public Shirt() {}
 *  ���� �� ���� 
 *  �ƹ��� ���۵� ���� �ʴ´�. ���� ����
 */
public class Shirt {
	
	public String brandName;
	public int price;
	public boolean longSleeved;              //�ʵ�
	
	public Shirt(String brandName, int price, boolean longSleeved) {            //������
		this.brandName = brandName;
		this.price = price;
		this.longSleeved = longSleeved;
	}
	public String getDetails() {
		return brandName + ", " + price + ", " + longSleeved;
	}
}
