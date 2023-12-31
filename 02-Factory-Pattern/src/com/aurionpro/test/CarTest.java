package com.aurionpro.test;

import com.aurionpro.model.CarFactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.ICars;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		ICars maruti = factory.makeCars(CarType.MARUTI);
		maruti.start();
		maruti.stop();
		System.out.println("-----------------------------------");
		ICars tata = factory.makeCars(CarType.TATA);
		tata.start();
		tata.stop();
	}
}
