package org.emp;

public class Client extends Employee {
	
	public void cliId() {
		System.out.println("Client ID is 999");

	}
	
	public void cliName() {
		System.out.println("Client Name is Saravana");

	}

	public static void main(String[] args) {
		Client c = new Client();
		c.empId();
		c.empName();
		c.cliId();
		c.cliName();
	}
}
