package com.github.factory.model;

public class Shelf implements Furniture {

	@Override
	public String furnitureType() {
		return "Oh boy, this is a Shelf";
	}

	@Override
	public String useFurniture() {
		return "Oh boy, you just used this shelf";
	}

}
