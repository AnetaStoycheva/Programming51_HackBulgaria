package com.hackbulgaria.programming51.week2;

public class Fridge {

	private int capacity = 0;
	private int totalWeight = 0;
	
	private Food[] arrayOfFood = new Food[0];
	private int foodCount = 0;
	private int currentWeight = 0;
	
	public Fridge(int capacity, int totalWeight) {
		this.capacity = capacity;
		this.totalWeight = totalWeight;
		arrayOfFood = new Food[capacity];
	}
	
	public boolean addFood(Food aFood) {
		if (foodCount < this.capacity && currentWeight + aFood.weight < this.totalWeight) {
			arrayOfFood[foodCount] = aFood;
			foodCount++;
			currentWeight += aFood.weight;
			return true;
		}
		return false;	
	}
	
	public int getFoodsCount() {
		return foodCount;
	}
	
	public String toString() {
		String result1 = "Fridge: " + "capacity: " + this.capacity + ", weight: " + totalWeight;
		String result2 = ", products: ";
		
		for (int i = 0; i < foodCount; i++) {
			result2 = result2 + arrayOfFood[i];
		}
		return result1 + result2;
	}
	
	public Food[] getProductsOfType(String typeFood) {
		int counter = 0;
		
		for (int i = 0; i < foodCount; i++) {
			if (arrayOfFood[i].typeFood.equals(typeFood)) {
				counter++;
			}
		}
		
		Food[] result = new Food[counter];
		int firstFree = 0;
		
		for (int j = 0; j < foodCount; j++) {
			if (arrayOfFood[j].typeFood.equals(typeFood)) {
				result[firstFree] = arrayOfFood[j];
				firstFree++;
			}
		}
		return result;
	}
	
	public int getWeight() {
		int result = 0;
		
		for (int i = 0; i < foodCount; i++) {
			result += arrayOfFood[i].weight;
		}
		return result;
	}
	
	public int getMaxWeight() {
		return totalWeight;
	}
	
	public Food getHeaviestFood() {
		Food result = arrayOfFood[0];
		
		for (int i = 0; i < foodCount; i++) {
			if (arrayOfFood[i].weight >= result.weight) {
				result = arrayOfFood[i];
			}
		}
		return result;
	}
	
	public int getCapacity() {
		return capacity;
	}
}
