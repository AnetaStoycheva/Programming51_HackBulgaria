package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class StringNormalizer {

	public static String normalizeString(String s) {
		StringBuilder result = new StringBuilder();
        int position = 0;
        while (position < s.length()) {
        	while (position < s.length() && s.charAt(position) == ' ') {
        		position++;
        	}
        	if (position == s.length()) {
        		break;
        	}
        	char firstLetter = s.charAt(position);
        	result.append(Character.toUpperCase(firstLetter));
        	position++;
        	while (position < s.length() && s.charAt(position) != ' ') {
        		result.append(Character.toLowerCase(s.charAt(position)));
        		position++;
        	}
        	result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        String s = scanner.nextLine();

        System.out.println(normalizeString(s));
	}
}
