package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;

public class HotelVendorRepoImpl implements HotelVendorRepo {
	public HotelVendorRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save " + entity);

	}

}
