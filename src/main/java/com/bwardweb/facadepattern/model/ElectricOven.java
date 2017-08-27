package com.bwardweb.facadepattern.model;

public class ElectricOven implements Oven{

	public void turnOn() {
		System.out.println("Turning on");		
	}

	public void setTemperature(int desiredTemperature) {
		System.out.println("Aiming for " + desiredTemperature);
		
	}

	public void turnOff() {
		System.out.println("Turning off");		
	}

}
