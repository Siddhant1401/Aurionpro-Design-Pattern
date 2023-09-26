package com.aurionpro.model;

public abstract class HatDecorator implements IHat {

	public IHat hatObj;
	
	public HatDecorator(IHat hatObj) {
		super();
		this.hatObj = hatObj;
	}

	@Override
	public String getHatName() {
		return hatObj.getHatName();
	}

	@Override
	public double getHatPrice() {
		return hatObj.getHatPrice();
	}

}
