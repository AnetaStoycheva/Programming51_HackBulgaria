package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int original_a = a;
		
		int reverse_a = 0;
		
		while (a > 0) {
			int remainder = a % 10;
			reverse_a = reverse_a * 10 + remainder;
			a = a / 10;
		}
		System.out.println(a);
		System.out.println(reverse_a);
		
		int sum_a_reverse_a = original_a + reverse_a;
		int original_sum = sum_a_reverse_a;
		int new_sum = 0;
		
		while (sum_a_reverse_a > 0) {
			int remainder = sum_a_reverse_a % 10;
			new_sum = new_sum * 10 + remainder;
			sum_a_reverse_a = sum_a_reverse_a / 10;
		}
		
		if (original_sum == new_sum) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
