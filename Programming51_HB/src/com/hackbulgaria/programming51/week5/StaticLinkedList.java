package com.hackbulgaria.programming51.week5;

import java.util.Arrays;

public class StaticLinkedList {
	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		// Reverse the list
		LinkedList<Integer> result = new LinkedList<>();
		for (int i = l.size() - 1; i >= 0; i--) {
			result.addLast(l.get(i));
		}
		return result;
	}

	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		// Sort the list ()
		LinkedList<Integer> result = new LinkedList<>();
		Integer[] values = new Integer[l.size()];
		l.toArray(values);
		Arrays.sort(values);
		result.addAll(values);
		
		return result;
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
		// Merge a and b into one sorted list
		LinkedList<Integer> result = new LinkedList<>();
		result.insertListBefore(0, a);
		result.insertListBefore(0, b);

		return sort(result);
	}
}
