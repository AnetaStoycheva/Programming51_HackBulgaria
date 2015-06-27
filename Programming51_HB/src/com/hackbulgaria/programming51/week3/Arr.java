package com.hackbulgaria.programming51.week3;

public class Arr {
	public static String toString(int[] a) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			result += a[i] + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;
	}

	public static int[] copy(int[] masiv) {
		int[] temp_masiv = new int[masiv.length];
		for (int i = 0; i < masiv.length; i++) {
			temp_masiv[i] = masiv[i];
		}
		return temp_masiv;
	}

	public static int[] sort(int[] masiv) {
		int[] result = copy(masiv);
		for (int i = 0; i < result.length; i++) {

			int index = i;
			for (int j = i; j < result.length; j++) {
				if (result[j] < result[index]) {
					index = j;
				}
			}
			int temp = result[i];
			result[i] = result[index];
			result[index] = temp;
		}
		return result;
	}

	public static int[] reverse(int[] a) {
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			result[a.length - 1 - i] = a[i];  
		}
		return result;
	}

	public static String join(int[] a, String glue) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			builder.append(a[i]);
			if (i != a.length - 1) {
				builder.append(glue);
			}
		}
		return builder.toString();
	}

	public static int sum(int[] a) {
		int result = 0;
		for (int element : a) {
			result += element;
		}
		return result;
	}

	public static int[] range(int a, int b) {
		int[] result = new int[b - a];
		for (int number = a; number < b; number++) {
			result[number - a] = number;
		}
		return result;
	}

	public static int[] filterOdd(int[] a) {
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				counter++;
			}
		}
		
		int[] result = new int[counter];
		int firstFreeIndex = 0;
		
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				result[firstFreeIndex] = a[j];
				firstFreeIndex++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, -50, 80, 70, 66, -365, 1, 3, 5, 0, 9 };

//		System.out.println("Print the array to string:");
//		System.out.println(Arr.toString(a));

//		System.out.println("Sort the array 'a' itself and print it sorted:");
//		int[] result = Arr.sort(a);
//		System.out.println(Arr.toString(result));

//		System.out.println("Print the reverse of the sorted array");
//		System.out.println(Arr.toString(reverse(a)));
		
		System.out.println("Output each element in a with -> between them");
		System.out.println(Arr.join(a, "->"));
		
//		System.out.println("Output the sum");
//		System.out.println(Arr.sum(a));
		
//		System.out.println("Output array with elements from 1 to 10");
//		System.out.println(Arr.toString(Arr.range(1, 10)));
		
//		System.out.println("Print only the odd numbers");
//		System.out.println(Arr.toString(filterOdd(a)));
	}
}
