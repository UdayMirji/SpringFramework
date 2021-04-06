package com.xworkz.fooddelivery.services;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepo;
import com.xworkz.fooddelivery.repository.HotelVendorRepoImpl;

public class HotelVendorServiceImpl implements HotelVendorSevice {
	private HotelVendorRepo repository = new HotelVendorRepoImpl();

	public HotelVendorServiceImpl() {

		System.out.println("created " + this.getClass().getSimpleName());

	}

	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
		System.out.println("invoked validateAndSave");
		if (null != entity) {
			System.out.println("entity is valid" + entity);
			repository.save(entity);

		} else {
			System.out.println("enetity is not valid");
		}

		return false;
	}

}
