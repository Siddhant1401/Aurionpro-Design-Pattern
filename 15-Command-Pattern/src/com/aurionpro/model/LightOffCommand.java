package com.aurionpro.model;

public class LightOffCommand implements ICommand {

	private Light light;
	
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}


	@Override
	public void execute() {
		light.off();
	}

}
