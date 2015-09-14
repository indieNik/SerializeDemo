package com.psl.serialize;

import java.io.Serializable;

public class Employee implements Serializable{

	int employeeId = 0;
	int employeeSalary = 80000;
	String employeeName = "Nik";
	
	public Employee(int salary, String name) {
		
		System.out.println("Employee Constr Called");
		
		employeeId++;
		employeeName = name;
		employeeSalary = salary;
	}
	
	 void displayEmployee() {
		System.out.println("Employee is :" + employeeId + " " + employeeName + " " + employeeSalary);
	}
	
	/*public static void main(String[] args) {
		StaticDemo obj = new StaticDemo(80000, "kfjhf");
		obj.displayEmployee();
		
		StaticDemo obj1 = new StaticDemo(80000, "anj");
		obj.displayEmployee();
		
		StaticDemo obj2 = new StaticDemo(80000, "najd");
		obj.displayEmployee();

	}*/

}
