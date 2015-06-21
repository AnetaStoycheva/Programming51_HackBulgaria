package com.hackbulgaria.programming51.week2;

public class Food {
	
	public String name = "";
	public String typeFood = "";
	public int weight = 1;

	public Food(String name, String typeFood, int weight) {
		this.name = name;
		this.typeFood = typeFood;
		this.weight = weight;
	}
	
	public String toString() {
		return this.name + ", Food type: '" + this.typeFood + "', " + this.weight + " grams.";
	}
}
