package com.bwardweb.facadepattern.model;

import java.util.ArrayList;

public interface Mixer {
	public void acceptIngredients(ArrayList<String> ingredients);
	public void turnOn();
	public void turnOff();
}
