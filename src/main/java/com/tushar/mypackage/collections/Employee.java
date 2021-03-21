package com.tushar.mypackage.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String employeeName;
	private List<String> employeePhones;
	private Set<String> employeeAddresses;
	private Map<String, String> employeeCourses;

	public Employee() {
	}

	public Employee(String employeeName, List<String> employeePhones, Set<String> employeeAddresses,
			Map<String, String> employeeCourses) {
		super();
		this.employeeName = employeeName;
		this.employeePhones = employeePhones;
		this.employeeAddresses = employeeAddresses;
		this.employeeCourses = employeeCourses;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getEmployeePhones() {
		return employeePhones;
	}

	public void setEmployeePhones(List<String> employeePhones) {
		this.employeePhones = employeePhones;
	}

	public Set<String> getEmployeeAddresses() {
		return employeeAddresses;
	}

	public void setEmployeeAddresses(Set<String> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	public Map<String, String> getEmployeeCourses() {
		return employeeCourses;
	}

	public void setEmployeeCourses(Map<String, String> employeeCourses) {
		this.employeeCourses = employeeCourses;
	}

}
