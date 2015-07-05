package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class MaxSpan {

	public static int maxSpan(int[] numbers) {
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j >= i; j--) {
				if (numbers[i] == numbers[j]) {
					result = Math.max(result, j - i + 1);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(maxSpan(numbers));
	}
}
