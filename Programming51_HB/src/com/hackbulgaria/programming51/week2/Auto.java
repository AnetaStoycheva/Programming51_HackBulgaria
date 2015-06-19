package com.hackbulgaria.programming51.week2;

public class Auto {
	public Person owner = new Person();
	public int maxSpeed = 0;
	public String brand = "";
	public String name = "";
	public int price = 0;
	
	public String toString() {
		return brand + " " + name + ", Max Speed: " + maxSpeed + ", Price: " + price + ", " + owner + "(" + owner.age + ")";
	}
	
}
