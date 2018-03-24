package com.techlabs.employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.techlabs.parser.CsvParser;

public class DataAnalyser {
	private CsvParser csvParser;
	private HashSet<Employee> empList;

	public DataAnalyser(CsvParser csvParser) {
		this.csvParser = csvParser;
	}

	public void printAllEmployee() {
		Employee emp;

		return;
	}

	public Employee getMaxSalary() throws FileNotFoundException, IOException {
		empList = csvParser.parser();
		int previous = 0;
		Employee maxSalariedEmployee = null;
		for (Employee emp : empList) {
			if (emp.getSalary() > previous) {
				previous = emp.getSalary();
				maxSalariedEmployee = emp;
			}
		}
		return maxSalariedEmployee;
	}

	public HashMap<Integer, ArrayList<Employee>> groupByDeptId()
			throws FileNotFoundException, IOException {
		empList = csvParser.parser();
		HashMap<Integer, ArrayList<Employee>> hashMap = new HashMap<Integer, ArrayList<Employee>>();
		for (Employee emp : empList) {
			if (!hashMap.containsKey(emp.getDeptId())) {
				ArrayList<Employee> list = new ArrayList<Employee>();
				list.add(emp);
				hashMap.put(emp.getDeptId(), list);
			} else {
				hashMap.get(emp.getEmployeeRole()).add(emp);
			}
		}
		return hashMap;
	}

	public HashMap<String, ArrayList<Employee>> groupByDesgination()
			throws FileNotFoundException, IOException {
		empList = csvParser.parser();
		HashMap<String, ArrayList<Employee>> hashMap = new HashMap<String, ArrayList<Employee>>();
		for (Employee emp : empList) {
			if (!hashMap.containsKey(emp.getEmployeeRole())) {
				ArrayList<Employee> list = new ArrayList<Employee>();
				list.add(emp);
				hashMap.put(emp.getEmployeeRole(), list);
			} else {
				hashMap.get(emp.getEmployeeRole()).add(emp);
			}
		}
		return hashMap;
	}
}
