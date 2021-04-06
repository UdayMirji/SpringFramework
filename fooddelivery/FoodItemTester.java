package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.Cuisine;
import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepo;
import com.xworkz.fooddelivery.repository.FoodItemRepoImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		FoodItemEntity entity=new FoodItemEntity("biriyani", 125, FoodType.VEGETERIAN, "4.6", "mint", Cuisine.ANDRA);
		FoodItemRepo repo=new FoodItemRepoImpl();
		repo.save(entity);
	}

}
