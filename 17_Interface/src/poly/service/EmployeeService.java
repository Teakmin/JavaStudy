package poly.service;

import poly.vo.Employee;

public interface EmployeeService {
	// 총 6개의 Template method를 선언
	void printInfo(Employee e);// 앞에 public abstract 생략
	void printAllInfo(Employee[] ea);
	Employee findByEmpId(Employee[] ea, String empId);
	Employee[] findByAddress(Employee[] ea, String addr);
	int getAnnualSalary(Employee e);
	int getTotalCost(Employee[] ea);
}
