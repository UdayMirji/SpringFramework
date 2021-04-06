package com.xworkz.fooddelivery.entity;

import com.xworkz.fooddelivery.constants.ModeOfPayment;

public class CustomerEntity {
	private String name;
	private String location;
	private int phoneNumber;
	private String email;
	private ModeOfPayment payment;

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", payment=" + payment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + phoneNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEntity other = (CustomerEntity) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (payment != other.payment)
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ModeOfPayment getPayment() {
		return payment;
	}

	public void setPayment(ModeOfPayment payment) {
		this.payment = payment;
	}

	public CustomerEntity(String name, String location, int phoneNumber, String email, ModeOfPayment payment) {
		super();
		this.name = name;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.payment = payment;
	}

}
