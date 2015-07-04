package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class StringNormalizerMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        String s = scanner.nextLine();

        System.out.println(StringNormalizer.normalizeString(s));
	}
}
