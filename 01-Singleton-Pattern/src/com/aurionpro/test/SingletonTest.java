package com.aurionpro.test;

import com.aurionpro.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton single = Singleton.getSingletonInstance();
		single.greetings();
	
		Singleton single1 = Singleton.getSingletonInstance();
		single1.greetings();
	}
	
}
