package com.bwardweb.facadepattern.model;

import java.util.ArrayList;

public class ElectricMixer implements Mixer{

	public void acceptIngredients(ArrayList<String> ingredients) {
		for(String ingredient:ingredients){
			System.out.println("Adding " + ingredient + " to mixer");
		}
		
	}

	public void turnOn() {
		System.out.println("Turning on");		
	}

	public void turnOff() {
		System.out.println("Turning off");		
	}

}
