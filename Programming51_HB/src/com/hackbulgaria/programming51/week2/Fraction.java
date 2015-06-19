package com.hackbulgaria.programming51.week2;

public class Fraction {
	
	int numerator = 0;
	int denominator = 1;
	
	Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Can't create a fraction with denominator 0!");
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double getReal() {
		double fraction = this.numerator / (double) this.denominator;
		return fraction;
	}
	
	public void add(Fraction otherFraction) {
		this.numerator = this.numerator * otherFraction.denominator + this.denominator * otherFraction.numerator;
		this.denominator *= otherFraction.denominator;
		this.simplify();
	}
	
//	статична ф-ия, обща за всички обекти от клас Fraction, вика се през class-а
	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public void simplify() {
		int gcd = Fraction.greatestCommonDivisor(this.numerator, this.denominator);
		this.numerator /= gcd;
		this.denominator /= gcd;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
}
