package com.xworkz.fooddelivery.entity;

import com.xworkz.fooddelivery.constants.ModeOfPayment;

public class HotelVendorEntity {
	private String name;
	private String location;
	private double rating;
	private ModeOfPayment payment;
	private String feedback;
	private String contctNumber;

	@Override
	public String toString() {
		return "HotelVendorEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", payment="
				+ payment + ", feedback=" + feedback + ", contctNumber=" + contctNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contctNumber == null) ? 0 : contctNumber.hashCode());
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (contctNumber == null) {
			if (other.contctNumber != null)
				return false;
		} else if (!contctNumber.equals(other.contctNumber))
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
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
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ModeOfPayment getPayment() {
		return payment;
	}

	public void setPayment(ModeOfPayment payment) {
		this.payment = payment;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getContctNumber() {
		return contctNumber;
	}

	public void setContctNumber(String contctNumber) {
		this.contctNumber = contctNumber;
	}

	public HotelVendorEntity(String name, String location, double rating, ModeOfPayment payment, String feedback,
			String contctNumber) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.payment = payment;
		this.feedback = feedback;
		this.contctNumber = contctNumber;
	}

}
