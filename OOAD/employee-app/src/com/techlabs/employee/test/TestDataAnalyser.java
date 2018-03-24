package com.techlabs.employee.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.techlabs.employee.DataAnalyser;
import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.parser.CsvParser;

public class TestDataAnalyser {
	public static void main(String args[]) throws FileNotFoundException,
			IOException {
		DataAnalyser analyser = new DataAnalyser(
				new CsvParser(new FileLoader()));
		Employee emp = analyser.getMaxSalary();
		System.out.println(emp.getEmployeeName());

		HashMap<String, ArrayList<Employee>> hashMap = new HashMap<String, ArrayList<Employee>>();
		hashMap = analyser.groupByDesgination();
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList = hashMap.get("'CLERK'");
		for (Employee employee : empList) {
			System.out.println(employee.getEmployeeName());
		}

		HashMap<Integer, ArrayList<Employee>> hashMap2 = new HashMap<Integer, ArrayList<Employee>>();
		hashMap2 = analyser.groupByDeptId();
		ArrayList<Employee> empList2 = new ArrayList<Employee>();
		System.out.println(emp.getDeptId());
		empList2 = hashMap2.get(30);
		System.out.println(empList2);
	}

}
