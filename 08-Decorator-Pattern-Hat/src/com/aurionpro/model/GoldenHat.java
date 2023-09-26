package com.aurionpro.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hatObj) {
		super(hatObj);
	}
	
	public String getHatName() {
		return "Golden Hat " + super.getHatName();
	}
	
	public double getHatPrice() {
		return 500 + super.getHatPrice();
	}

}
