package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirector;
import com.aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Developer developer1 = new Developer("Ram Singh", 101, "Developer");
		Developer developer2 = new Developer("Sita Singh", 102, "Java Developer");
		
		EmployeeDirector devEmployee = new EmployeeDirector();
		devEmployee.addEmployee(developer1);
		devEmployee.addEmployee(developer2);
		
		Manager manager1 = new Manager("Shyam", 201, "HR Manager");
		Manager manager2 = new Manager("Radha", 202, "Manager");
		
		EmployeeDirector managerEmployee = new EmployeeDirector();
		managerEmployee.addEmployee(manager1);
		managerEmployee.addEmployee(manager2);
		
		EmployeeDirector directory = new EmployeeDirector();
		directory.addEmployee(devEmployee);
		directory.addEmployee(managerEmployee);
		directory.showEmployeeDetails();
	}
}
