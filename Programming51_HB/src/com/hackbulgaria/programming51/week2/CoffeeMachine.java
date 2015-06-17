package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	public Coffee[] brandsOfCoffee = new Coffee[10];
	private float balance = 0.0f;
	
	public float getBalance() {
		return balance;
	}

	public int availableBrands = 0;
	
	public boolean addCoffee(Coffee coffee) {
		if (availableBrands >= 10) {
			return false;
		} else {
			brandsOfCoffee[availableBrands] = coffee;
			availableBrands++;
			return true;
		}
	}
		
	public float buyCoffee(String brandName, float userMoney) {
		for (int i = 0; i < availableBrands; i++) {
			
			if (brandsOfCoffee[i].brand.equals(brandName)) {
				
				if (userMoney >= brandsOfCoffee[i].price) {
					float change = userMoney - brandsOfCoffee[i].price;
					balance += brandsOfCoffee[i].price;
					return change;
				}
			} 
		}
		return -1;
	}
}
