package com.xworkz.spring.component.wardencomponent;

public class PGComponent {
	private String ownerName;
	private WardenComponent warden;

	public PGComponent() {
		System.out.println("creatd PGComponent " + this.getClass().getSimpleName());
	}

	public void setOwnerName(String ownerName) {
		System.out.println("invoked setOwnerName " + ownerName);
		this.ownerName = ownerName;
	}

	public void setWarden(WardenComponent warden) {
		System.out.println("invoked setWarden " + warden);
		this.warden = warden;
	}

	public void prepareFood() {
		System.out.println("invoked prepareFood");
		this.warden.serveFood();
	}

}
