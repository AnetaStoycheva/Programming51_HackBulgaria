package com.hackbulgaria.programming51.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static boolean areAnagrams(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        String sortedA = new String(chars);
		
        char[] chars2 = b.toCharArray();
        Arrays.sort(chars2);
        String sortedB = new String(chars2);
        
	    return sortedA.equals(sortedB); 
	}
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String a = scanner.next();
	    String b = scanner.next();

	    if (areAnagrams(a, b)) {
	      System.out.println("ANAGRAMS");
	    } else {
	      System.out.println("NOT ANAGRAMS");
	    }
	}
}
