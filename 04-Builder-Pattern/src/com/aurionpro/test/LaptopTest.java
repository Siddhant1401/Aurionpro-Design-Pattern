package com.aurionpro.test;

import com.aurionpro.model.IGadget;
import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		LaptopBuilder builder = new LaptopBuilder();
		builder.addId(101).addBrand("Dell");
		builder.addHdd("Segate 512GB").addProcessor("Intel Core").addRam("128 GB").addTouchScreen(true);
//		
//		Laptop laptop = builder.build();
//		System.out.println(laptop);
		
		IGadget laptop = builder.build();
		System.out.println(laptop);
		System.out.println(laptop.getBrand());
	}
}
