package com.aurionpro.model;

public class HotelReception {

	public void getIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		
		IMenu indianMenu = indianHotel.getMenu();
		
		indianMenu.displayMenu();
	}
	
	public void getItalainMenu() {
		IHotel italianHotel = new ItalainHotel();
		
		IMenu italianMenu = italianHotel.getMenu();
		
		italianMenu.displayMenu();
	}
}
