package com.github.factory.factory;

import com.github.factory.model.Closet;
import com.github.factory.model.Furniture;
import com.github.factory.model.Rack;
import com.github.factory.model.Shelf;

public class FurnitureFactory {

	public static Furniture getFurniture(String furnitureType) {
		if (furnitureType == null)
			return null;

		if (furnitureType.equalsIgnoreCase("SHELF"))
			return new Shelf();

		else if (furnitureType.equalsIgnoreCase("RACK"))
			return new Rack();

		else if (furnitureType.equalsIgnoreCase("CLOSET"))
			return new Closet();

		return null;
	}
}
