package com.hackbulgaria.programming51.week4;

import java.util.Vector;

public class BirthdayRanges {

	public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> ranges) {
		Vector<Integer> result = new Vector<Integer>();
		for (IntPair element : ranges) {
			int counter = 0;
			for (Integer date : birthdays) {
				if (date >= element.start && date <= element.end) {
					counter++;
				}
			}
			result.add(counter);
		}
		return result;
	}
}
