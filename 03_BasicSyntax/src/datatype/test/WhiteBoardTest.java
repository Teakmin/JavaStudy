package datatype.test;

import datatype.WhiteBoard;

 /* �׽�Ʈ Ŭ������ �ϴ� ��
  * 1) ��ü ����.... ��ü�� �������(�ı�(�Ӽ�, �޼ҵ�))�� �޸𸮿� �ø���.
  * 2) �ı��� ����
  * 		�ʵ� ---�� �Ҵ�
  * 		�޼ҵ� --- calling
  */
public class WhiteBoardTest {
                                 //������� field
	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();     //������ class + �ν��Ͻ� = new + Ŭ����
		
		wb.setField(36, 'W', 115.5f, "�Ｚ", true);  //�ν��Ͻ�.method()
		System.out.println(wb.toString());
		
	}

}
