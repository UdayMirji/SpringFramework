package com.xworkz.fooddelivery.services;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepo;
import com.xworkz.fooddelivery.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepo repository = new CustomerRepoImpl();

	public CustomerServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave");
		if (null != entity) {
			System.out.println("entity is valid" + entity);
			repository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
