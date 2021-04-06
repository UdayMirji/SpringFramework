
package com.xworkz.spring.component;

public class CameraComponent {
	public CameraComponent() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public void capture(String image){
		System.out.println("campturing image of "+image);
	}
}
