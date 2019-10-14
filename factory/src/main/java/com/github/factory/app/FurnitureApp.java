package com.github.factory.app;

import com.github.factory.factory.FurnitureFactory;
import com.github.factory.model.Furniture;

public class FurnitureApp {

	public static void main(String args[]) {
		Furniture shelf = FurnitureFactory.getFurniture("SHELF");
		Furniture closet = FurnitureFactory.getFurniture("CLOSET");
		Furniture rack = FurnitureFactory.getFurniture("RACK");
		
		System.out.println(shelf.furnitureType());
		System.out.println(shelf.useFurniture());
		
		System.out.println(closet.furnitureType());
		System.out.println(closet.useFurniture());
		
		System.out.println(rack.furnitureType());
		System.out.println(rack.useFurniture());
		
		
	}
}
