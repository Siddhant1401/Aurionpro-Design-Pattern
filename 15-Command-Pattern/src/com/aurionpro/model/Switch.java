package com.aurionpro.model;

public class Switch {

	private ICommand onCommand;
	private ICommand offCommand;
	public Switch(ICommand onCommand, ICommand offCommand) {
		super();
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public void turnOn() {
		onCommand.execute();
	}
	
	public void turnOff() {
		offCommand.execute();
	}
}
