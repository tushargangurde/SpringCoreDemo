package com.tushar.mypackage.ref;

public class B {

	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public B() {
	}

	public B(int y) {
		super();
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

}
