package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.RibbonedHat;
import com.aurionpro.model.StandardHat;

public class HatTest {

	public static void main(String[] args) {
		
		IHat hat =  new StandardHat();
		GoldenHat goldHat = new GoldenHat(hat);
//		RibbonedHat ribbonHat = new RibbonedHat(goldHat);
		System.out.println(goldHat.getHatName());
		System.out.println(goldHat.getHatPrice());
	}
}
