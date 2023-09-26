package com.aurionpro.model;

public class StandardHat implements IHat {

	@Override
	public String getHatName() {
		return "Standard Hat";
	}

	@Override
	public double getHatPrice() {
		return 100;
	}

}
