package com.xworkz.spring.component.wardencomponent;

public class WardenComponent {
	private String name;


	public WardenComponent() {
		System.out.println("creted WardenComponent" + this.getClass().getSimpleName());
	}

	public void setName(String name) {
		System.out.println("invoked setName "+name);
		this.name = name;
	}

	public void serveFood() {
		System.out.println("invoked servedFood");

	}

}
