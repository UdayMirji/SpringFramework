package com.xworkz.spring.component.waschingmachine;

public class Motor {
	private int warantyPeriod;

	public Motor() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public void setWarantyPeriod(int warantyPeriod) {
		System.out.println("invoked " + warantyPeriod);
		this.warantyPeriod = warantyPeriod;
	}

	public void rotate() {
		System.out.println("rotating  motor ");
	}

	@Override
	public String toString() {

		return "Motor[warantyPeriod=" + warantyPeriod + "]";
	}

}
