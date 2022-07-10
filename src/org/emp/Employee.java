package org.emp;

public class Employee {
	
	public void empId() {
		System.out.println("Employee ID is 787967");

	}
	
	public void empName() {
		System.out.println("Employee Name is Saravana");

	}
	
	public void empDob() {
		System.out.println("Employee DOB is 06/06/1995");

	}
	
	private void empPhone() {
		System.out.println("Phone number is 1234567890");
	}
	
	private void empEmail() {
		System.out.println("Email is cspandiyan95@gmail.com");

	}
	
	private void empAddress() {
		System.out.println("Address is Tambaram");

	}

	public static void main(String[] args) {
		Employee a=new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
		
	}
	
	
}
