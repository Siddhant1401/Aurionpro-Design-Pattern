package com.aurionpro.model;

import java.util.HashMap;

public class CircleFactory {

	private HashMap<String, Circle> map = new HashMap<>();
	
	public Circle getCircle(String color) {
		Circle circle = map.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
		}
		
		return circle;
	}
}
