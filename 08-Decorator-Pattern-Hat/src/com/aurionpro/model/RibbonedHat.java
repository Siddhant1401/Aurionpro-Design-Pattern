package com.aurionpro.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hatObj) {
		super(hatObj);
	}
	
	public String getHatName() {
		return "Ribboned Hat " + super.getHatName();
	}
	
	public double getHatPrice() {
		return 1000 + super.getHatPrice();
	}

}
