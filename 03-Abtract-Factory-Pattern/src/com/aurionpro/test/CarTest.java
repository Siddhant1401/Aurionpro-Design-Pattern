package com.aurionpro.test;

import com.aurionpro.model.ICarFactory;
import com.aurionpro.model.ICars;
import com.aurionpro.model.Mahindra;
import com.aurionpro.model.MahindraFactory;
import com.aurionpro.model.Maruti;
import com.aurionpro.model.MarutiFactory;

public class CarTest {

	public static void main(String[] args) {
		ICarFactory marutiCar = MarutiFactory.getMarutiFactoryInstance();

		ICars maruti = marutiCar.makeCar();

		maruti.start();
		maruti.stop();

		ICarFactory mahindraCar = MahindraFactory.getMahindraFactoryInstance();

		ICars mahindra = mahindraCar.makeCar();

		mahindra.start();
		mahindra.stop();

	}
}
