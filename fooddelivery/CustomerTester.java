package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.ModeOfPayment;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepo;
import com.xworkz.fooddelivery.repository.CustomerRepoImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity entity = new CustomerEntity("Rajeev", "babashankari", 98765213, "rajeev@gmail.com",
				ModeOfPayment.CREDITCARD);
		CustomerRepo repo = new CustomerRepoImpl();
		repo.save(entity);

	}

}
