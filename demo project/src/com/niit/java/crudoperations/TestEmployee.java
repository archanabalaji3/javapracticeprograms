package com.niit.java.crudoperations;

import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		EmployeeList list=new EmployeeList();
		List<Employee> employeelist=list.createEmployeeList();
				list.displayEmployee(employeelist);
				System.out.println(list.exist(employeelist,103));
	}
}
