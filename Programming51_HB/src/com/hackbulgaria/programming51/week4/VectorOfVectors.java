package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Vector;

public class VectorOfVectors {

	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> values) {
		Vector<Integer> allNumbers = new Vector<>();
		for (Vector<Integer> masiv: values) {
			for (Integer number: masiv) {
				allNumbers.add(number);
			}
		}
		Collections.sort(allNumbers);
		
		if (allNumbers.isEmpty()) {
			return allNumbers;
		}
		
		Vector<Integer> result = new Vector<>();
		result.add(allNumbers.get(0));
		for (int i = 1; i < allNumbers.size(); i++) {
			if (! allNumbers.get(i).equals(allNumbers.get(i - 1))) {
				result.add(allNumbers.get(i));
			}
		}
		return result;
	}
}
