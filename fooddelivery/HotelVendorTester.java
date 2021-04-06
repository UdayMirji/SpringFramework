package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constants.ModeOfPayment;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepo;
import com.xworkz.fooddelivery.repository.HotelVendorRepoImpl;

public class HotelVendorTester {

	public static void main(String[] args) {
		HotelVendorEntity entity = new HotelVendorEntity("imperio", "Rajajinagar", 4.5, ModeOfPayment.CASH, "good",
				"8907645532");
		HotelVendorRepo repo = new HotelVendorRepoImpl();
			repo.save(entity);

	}

}
