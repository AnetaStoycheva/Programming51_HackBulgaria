package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		System.out.println("Integer1: " + a);
		System.out.println(oper);
		System.out.println("Integer2: " + b);

		if (oper == '+') {
			System.out.println("Result is: " + (a + b));
		} else if (oper == '-') {
			System.out.println("Result is: " + (a - b));
		} else if (oper == '*') {
			System.out.println("Result is: " + (a * b));
		} else if (oper == '/') {
			System.out.println("Result is: " + (a / b));
		} else if (oper == '^') {
			int result = 1;
			
			for (int i = 0; i < b; i++) {
				result = result * a;
			}
			System.out.println(result);
		} else if (oper == '?') {
			int a_fact = 1;
			int b_fact = 1;
			
			for (int i = 1; i <= a; i++) {
				a_fact *= i;
			}
			System.out.println("a fact is: " + a_fact);
			for (int i = 1; i <= b; i++) {
				b_fact *= i;
			}
			System.out.println("a fact is: " + b_fact);
			System.out.println("Result is: " + (a_fact + b_fact));
		}
	}
}
