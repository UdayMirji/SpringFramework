package com.xworkz.spring.component.roket;

public class Rocket {
	private String fuelType;
	private String country;
	public Rocket(String fuelType, String country) {
		super();
		
		this.fuelType = fuelType;
		this.country = country;
		System.out.println("Creating fuelType "+fuelType+" and country "+country);
	}
	
	@Override
	public String toString() {
		return "Rocket [fuelType=" + fuelType + ", country=" + country + "]";
	}

}
