package com.bwardweb.facadepattern;

import java.util.ArrayList;

import com.bwardweb.facadepattern.model.BreadMaker;
import com.bwardweb.facadepattern.model.ElectricMixer;
import com.bwardweb.facadepattern.model.ElectricOven;
import com.bwardweb.facadepattern.model.Mixer;
import com.bwardweb.facadepattern.model.Oven;
import com.bwardweb.facadepattern.model.RobotBreadMaker;

public class Runner {

	public static void main(String[] args) {
		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("Flour");
		ingredients.add("Yeast");
		ingredients.add("Water");
		ingredients.add("Salt");
		
		Oven oven = new ElectricOven();
		Mixer mixer = new ElectricMixer();
		BreadMaker breadMaker = new RobotBreadMaker(oven, mixer);
		
		System.out.println("-----------------------------------");
		System.out.println("MANUALLY MAKING BREAD");
		System.out.println("-----------------------------------");
		mixer.acceptIngredients(ingredients);
		mixer.turnOn();
		mixer.turnOff();		
		System.out.println("Putting bread into of oven");		
		oven.turnOn();
		oven.setTemperature(180);
		oven.turnOff();		
		System.out.println("Taking bread out of oven");
		
		System.out.println("-----------------------------------");
		System.out.println("USING MY ROBOT TO MAKE BREAD");
		System.out.println("-----------------------------------");
		breadMaker.makeBread(ingredients);
		

	}

}
