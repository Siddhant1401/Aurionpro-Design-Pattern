package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.CircleFactory;

public class FlyWeightTest {

	public static void main(String[] args) {
		
		String[] colors = {"blue","green","red","blue","yellow","blue","red"};
		
		CircleFactory factory = new CircleFactory();
		for (String color : colors) {
			Circle circle = factory.getCircle(color);
			circle.draw();
		}
		
	}
}
