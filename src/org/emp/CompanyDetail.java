package org.emp;

public class CompanyDetail extends Employee  {
	
	public void comId() {
		System.out.println("company ID is 123 ");

	}
	
	public void comName() {
		System.out.println("Company name is Sweet Home");
		

	}
	public static void main(String[] args) {
		CompanyDetail c = new CompanyDetail();
		c.empId();
		c.empName();
		c.comId();
		c.comName();
	}
	
}
