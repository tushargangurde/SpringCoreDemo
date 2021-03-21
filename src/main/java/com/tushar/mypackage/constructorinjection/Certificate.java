package com.tushar.mypackage.constructorinjection;

public class Certificate {

	String name;

	public Certificate(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}

}
