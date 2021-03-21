package com.tushar.mypackage.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tushar/mypackage/collections/collection-config.xml");

		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeePhones());
		System.out.println(employee.getEmployeeAddresses());
		System.out.println(employee.getEmployeeCourses());

	}

}
