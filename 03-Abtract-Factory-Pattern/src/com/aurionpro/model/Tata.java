package com.aurionpro.model;

public class Tata implements ICars {

	@Override
	public void start() {
		System.out.println("TATA car Started");
	}

	@Override
	public void stop() {
		System.out.println("TATA car stopped");
	}

}
