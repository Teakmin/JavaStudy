package poly.vo;

public class Manager extends Employee{
	private String dept;

	public String getDept() {
		return dept;
	}

	public Manager(String empId, String name, String addr, int salary, String dept) {
		super(empId, name, addr, salary);
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + ", Manager [dept=" + dept + "]";
	}
}
