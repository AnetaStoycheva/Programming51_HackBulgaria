package com.hackbulgaria.programming51.week3;

public class TravelMain {

	public static void main(String[] args) {
		Employee rado = new Employee("Radoslav Georgiev");
		System.out.println(rado.toString().equals("Radoslav Georgiev")); // true

		Employee ivo = new Employee("Ivaylo");
		TravelExpense dinner = new TravelExpense("Dinner", ivo, 100);

		System.out.println(dinner.getType().equals("Dinner")); // true
		System.out.println(dinner.getEmployee().toString().equals("Ivaylo")); // true
		System.out.println(dinner.getCost() == 100); // true
		
		TravelExpense breakfast = new TravelExpense("Breakfast", rado, 30);
		
		Travel conf = new Travel("Germany", "Berlin", 20);

		System.out.println(conf.getCountry().equals("Germany")); // true
		System.out.println(conf.getCity().equals("Berlin")); // true
		System.out.println(conf.getVat() == 20); // true

		conf.addExpense(dinner);
		conf.addExpense(breakfast);

		System.out.println(conf.totalNetCost() == 100); // true
		System.out.println(conf.totalCost() == 120); // VAT Included -> true
		
		System.out.println(conf.totalCost());
		
//		Employee[] toFire = conf.mostExpensesMadeBy();

//		System.out.println(toFire[0].getName().equals("Ivaylo")); // true
	}

}
