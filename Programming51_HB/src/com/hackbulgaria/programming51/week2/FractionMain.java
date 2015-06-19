package com.hackbulgaria.programming51.week2;

public class FractionMain {

	public static void main(String[] args) {
		Fraction a = new Fraction(4, 12);
		Fraction b = new Fraction(5, 24);
		Fraction c = new Fraction(6, 24);

		System.out.println(a);
		System.out.println(a.getReal());
		a.add(b);
		System.out.println(a);
		
		c.simplify();
		System.out.println(c);

	}

}
