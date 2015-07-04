package com.hackbulgaria.programming51.week3;

public class IntegerVectorStatic {

	public static String toString(IntegerVector v) {
		String result = "";
		for (int i = 0; i < v.size(); i++) {
			result += v.get(i);
			if (i != v.size() - 1) {
				result += ", ";
			}
		}
		return result;
	}
	
	public static void sort(IntegerVector v) {
		for (int i = 0; i < v.size(); i++) {
			int minIndex = i;
			for (int j = i; j < v.size(); j++) {
				if (v.get(j) < v.get(minIndex)) {
					minIndex = j;
				}
			}
			int temp = v.get(minIndex);
			v.set(minIndex, v.get(i));
			v.set(i, temp);
		}
	}

	public static IntegerVector reverse(IntegerVector v) {
		int counter = v.size() - 1;
		for (int i = 0; i < v.size() / 2; i++) {
			int temp = v.get(counter);
			v.set(counter, v.get(i));
			v.set(i, temp);
			counter--;
		}
		return v;
	}

	public static String join(IntegerVector v, String glue) {
		String result = "";
		for (int i = 0; i < v.size(); i++) {
			result += v.get(i);
			if (i != v.size() - 1) {
				result += glue;
			}
		}
		return result;
	}

	public static int sum(IntegerVector v) {
		int result = 0;
		for (int i = 0; i < v.size(); i++) {
			result += v.get(i);
		}
		return result;
	}

	public static IntegerVector range(int a, int b) {
		IntegerVector result = new IntegerVector();
		for (int i = a; i < b; i++) {
			result.add(i);
		}
		return result;
	}

	public static IntegerVector filterOdd(IntegerVector v) {
		IntegerVector result = new IntegerVector();
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i) % 2 != 0) {
				result.add(v.get(i));
			}
		}
		return result;
	}
}
