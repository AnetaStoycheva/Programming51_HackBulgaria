package com.hackbulgaria.programming51.week2;

public class FridgeMain {

	public static void main(String[] args) {
		Fridge fridge = new Fridge(20, 10000);
		
	    fridge.addFood(new Food("Cheese", "Milk", 300));
	    fridge.addFood(new Food("Milk", "Milk", 1000));
	    fridge.addFood(new Food("Beer", "Bevarage", 500));

	    System.out.println(fridge.getWeight());
	    
	    System.out.println(fridge.getFoodsCount());
	    
	    Food[] temp = fridge.getProductsOfType("Milk");
	    
	    for (int i = 0; i < temp.length; i++) {
	        System.out.println(temp[i]);
	    }
	    
	    System.out.println(fridge.getMaxWeight());
	    System.out.println(fridge.getHeaviestFood());
	    System.out.println(fridge.getCapacity());
	}
}