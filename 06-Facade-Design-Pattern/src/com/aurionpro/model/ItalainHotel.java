package com.aurionpro.model;

public class ItalainHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}

}
