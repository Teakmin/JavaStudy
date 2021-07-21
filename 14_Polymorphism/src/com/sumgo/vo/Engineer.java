package com.sumgo.vo;

public class Engineer extends Employee{
	private String tech;
	private int bonus;
	
	public Engineer(String empId, String name, String addr, int salary, String tech, int bonus) {
		super(empId, name, addr, salary);
		this.tech = tech;
		this.bonus = bonus;
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
