package com.aurionpro.test;

import com.aurionpro.model.ICommand;
import com.aurionpro.model.Light;
import com.aurionpro.model.LightOffCommand;
import com.aurionpro.model.LightOnCommand;
import com.aurionpro.model.Switch;

public class CommandTest {

	public static void main(String[] args) {
		
		Light light = new Light();
		ICommand lightOn = new LightOnCommand(light);
		ICommand lightOff = new LightOffCommand(light);
		
		Switch lightSwitch = new Switch(lightOn, lightOff);
		lightSwitch.turnOn();
		lightSwitch.turnOff();
	}
}
