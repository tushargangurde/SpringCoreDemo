package com.tushar.mypackage.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/mypackage/ref/ref-config.xml");

		A a = (A) context.getBean("aref");

		System.out.println(a.getX());
		System.out.println(a.getB().getY());

	}

}
