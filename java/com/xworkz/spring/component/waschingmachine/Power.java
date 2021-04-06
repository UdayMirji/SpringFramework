package com.xworkz.spring.component.waschingmachine;

public class Power {
	private boolean on;

	public Power() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public boolean isOn() {
		return on;
		
	}
	public void setOn(boolean on) {
		this.on = on;
	}

	@Override
	public String toString() {
		return "Power [on=" + on + "]";
	}

}
