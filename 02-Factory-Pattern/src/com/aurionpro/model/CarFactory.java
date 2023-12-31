package com.aurionpro.model;

public class CarFactory {

	public ICars makeCars(CarType car) {
		
		if(car == CarType.MARUTI) {
			return new Maruti();
		}
		
		if(car == CarType.TATA) {
			return new Tata();
		}
		
		if(car == CarType.MAHINDRA) {
			return new Mahindra();
		}
		
		return null;
	}
}
