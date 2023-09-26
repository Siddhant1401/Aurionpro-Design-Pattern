package com.aurionpro.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "Consultant role description";
	}

	@Override
	public String responsibility() {
		return "Consultant Responsibilities";
	}

}
