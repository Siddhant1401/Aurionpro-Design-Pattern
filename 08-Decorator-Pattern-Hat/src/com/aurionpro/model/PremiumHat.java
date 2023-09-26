package com.aurionpro.model;

public class PremiumHat implements IHat {

	@Override
	public String getHatName() {
		return "Premium Hat";
	}

	@Override
	public double getHatPrice() {
		return 200;
	}

}
