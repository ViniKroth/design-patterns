package com.github.factory.model;

public class Rack implements Furniture{

	@Override
	public String furnitureType() {
		return "Oh boy, this is a Rack";
	}

	@Override
	public String useFurniture() {
		return "Oh boy, you just used this rack";
	}
	
}
