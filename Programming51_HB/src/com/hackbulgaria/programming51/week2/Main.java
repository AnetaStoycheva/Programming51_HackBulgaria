package com.hackbulgaria.programming51.week2;

public class Main {

	public static void main(String[] args) {
		Coffee java = new Coffee();
		java.brand = "Java";
		java.price = 10.5f;
		System.out.println(java);
		
		Coffee mocca = new Coffee();
		mocca.brand = "Mocca";
		mocca.price = 8;
		System.out.println(mocca);
		
		Coffee lavazza = new Coffee();
		lavazza.brand = "Lavazza";
		lavazza.price = 6.35f;
		System.out.println(lavazza);
		
		Coffee lavazzaSmall = new Coffee();
		lavazzaSmall.brand = "Lavazza";
		lavazzaSmall.price = 4.25f;
		System.out.println(lavazzaSmall);
		
		CoffeeMachine cm = new CoffeeMachine();

		cm.addCoffee(lavazza);
		cm.addCoffee(lavazzaSmall);
		cm.addCoffee(mocca);
		cm.addCoffee(java);
		
		System.out.println(cm.buyCoffee("Latte", 3.40f));
		System.out.println(cm.buyCoffee("Java", 13.40f));
		System.out.println(cm.buyCoffee("Lavazza", 5));

		System.out.println("Current balance in the CoffeeMachine is:  " + cm.getBalance());
		

	}

}
