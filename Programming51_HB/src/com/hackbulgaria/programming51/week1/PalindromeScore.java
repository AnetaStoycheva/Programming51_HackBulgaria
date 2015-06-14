package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int result = 0;

		while (true) {

			int reverse_n = 0;
			int original_n = n;

			while (n > 0) {
				int remainder = n % 10;
				reverse_n = reverse_n * 10 + remainder;
				n = n / 10;
			}

			if (original_n == reverse_n) {
				result += 1;
				break;

			} else {
				result += 1;
				n = original_n + reverse_n;
			}
		}

		System.out.println(result);

	}
}
