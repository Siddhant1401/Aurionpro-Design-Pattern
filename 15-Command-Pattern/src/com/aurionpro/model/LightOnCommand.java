package com.aurionpro.model;

public class LightOnCommand implements ICommand {

	private Light light;
	
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}


	@Override
	public void execute() {
		light.on();
	}

}
