package com.xworkz.fooddelivery.entity;

import com.xworkz.fooddelivery.constants.Cuisine;
import com.xworkz.fooddelivery.constants.FoodType;

public class FoodItemEntity {
	private String name;
	private double price;
	private FoodType type;
	private String rating;
	private String flavor;
	private Cuisine cuisine;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuisine == null) ? 0 : cuisine.hashCode());
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", type=" + type + ", rating=" + rating
				+ ", flavor=" + flavor + ", cuisine=" + cuisine + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItemEntity other = (FoodItemEntity) obj;
		if (cuisine != other.cuisine)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public String getRating() {
		return rating;
	}

	void setRating(String rating) {
		this.rating = rating;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Cuisine getCuisine() {
		return cuisine;
	}

	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}

	public FoodItemEntity(String name, double price, FoodType type, String rating, String flavor, Cuisine cuisine) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.rating = rating;
		this.flavor = flavor;
		this.cuisine = cuisine;
	}

}
