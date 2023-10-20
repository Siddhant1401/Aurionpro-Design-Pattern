package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirector implements IEmployee {

	private List<IEmployee> employeeList = new ArrayList<IEmployee>();

	@Override
	public void showEmployeeDetails() {
		for (IEmployee iEmployee : employeeList) {
			iEmployee.showEmployeeDetails();
		}
	}

	public void addEmployee(IEmployee iEmployee) {
		employeeList.add(iEmployee);
	}

	public void removeEmployee(IEmployee iEmployee) {
		employeeList.remove(iEmployee);
	}

}
