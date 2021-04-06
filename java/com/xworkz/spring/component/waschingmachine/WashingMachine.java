package com.xworkz.spring.component.waschingmachine;

public class WashingMachine {
	private String componyName;
	private float capacity;
	private Motor motor;
	private Power power;

	public WashingMachine() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public void setComponyName(String componyName) {
		System.out.println("invoked setComponyName " + componyName);
		this.componyName = componyName;
	}

	public void setCapacity(float capacity) {
		System.out.println("invoked setCapacity " + capacity);
		this.capacity = capacity;
	}

	public void setMotor(Motor motor) {
		System.out.println("invoked setMotor " + motor);
		this.motor = motor;
	}

	public void setPower(Power power) {
		System.out.println("invoked " + power);
		this.power = power;
		this.power.isOn();
	}

	public void wash() {

		if (power.isOn()) {
			System.out.println("invoked wash: ");
			this.motor.rotate();
		} else {
			System.out.println("power is off motor is not rotating");
		}

	}

	@Override
	public String toString() {
		return "WashingMachine [componyName=" + componyName + ", capacity=" + capacity + ", motor=" + motor + ", power="
				+ power + "]";
	}

}
