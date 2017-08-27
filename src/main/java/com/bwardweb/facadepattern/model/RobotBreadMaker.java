package com.bwardweb.facadepattern.model;

import java.util.ArrayList;

public class RobotBreadMaker implements BreadMaker{
	private Oven oven;
	private Mixer mixer;
	
	public RobotBreadMaker(Oven oven, Mixer mixer){
		this.oven = oven;
		this.mixer = mixer;
	}

	public void makeBread(ArrayList<String> ingredients) {
		mixer.acceptIngredients(ingredients);
		mixer.turnOn();
		mixer.turnOff();		
		
		System.out.println("Putting bread into of oven");
		
		oven.turnOn();
		oven.setTemperature(180);
		oven.turnOff();
		
		System.out.println("Taking bread out of oven");
		
	}
	
}
