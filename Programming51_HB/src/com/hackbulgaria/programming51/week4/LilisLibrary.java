package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Vector;

public class LilisLibrary {

	public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
		Vector<Pair<String, Integer>> result = new Vector<>();
		Collections.sort(books);
		
		if (books.isEmpty()) {
			return result;
		}
		
		result.add(new Pair<String, Integer>(books.get(0), 1));
		for (int i = 1; i < books.size(); i++) {
			if (books.get(i).equals(books.get(i - 1))) {
				result.get(result.size() - 1).second++;
			} else {
				result.add(new Pair<>(books.get(i), 1));
			}
		}
		return result;
	  }
}
