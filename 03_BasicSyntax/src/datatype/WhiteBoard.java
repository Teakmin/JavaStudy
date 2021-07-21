package datatype;

public class WhiteBoard {
	
	public int size;
	public char color;
	public float price; 
	public String company;
	public boolean scratch; //��������� field
	
	public void setField(int size,char color, float price, String company, boolean scratch) {
		this.size = size;
		this.color = color;
		this.price = price;
		this.company = company;
		this.scratch = scratch;
		
	}
	 //���� �߰�ȣ�� �������ϱ� ���⼭���� ���ο� �޼ҵ�
	public String toString() {
		return size + "\t" + color + price + "\t" + company + "\t" + scratch;
	}

}
