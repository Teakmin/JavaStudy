package datatype;

public class WhiteBoard {
	
	public int size;
	public char color;
	public float price; 
	public String company;
	public boolean scratch; //여기까지가 field
	
	public void setField(int size,char color, float price, String company, boolean scratch) {
		this.size = size;
		this.color = color;
		this.price = price;
		this.company = company;
		this.scratch = scratch;
		
	}
	 //위에 중괄호고 끝났으니까 여기서부터 새로운 메소드
	public String toString() {
		return size + "\t" + color + price + "\t" + company + "\t" + scratch;
	}

}
