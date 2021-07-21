package poly.vo;

public class Engineer extends Employee{
	private String tech;  //얘네는 이따가 override하겠지?
	private int bonus;
	
	public Engineer(String empId, String name, String addr, int salary, String tech, int bonus) {
		super(empId, name, addr, salary);
		this.tech = tech;
		this.bonus = bonus;   //부모 생성자 받으면 자동으로 자식 필드도 자동 생성
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Engineer [tech=" + tech + ", bonus=" + bonus + "]";
	}

}
