package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class BirthdayRangesMain {

	public static void main(String[] args) {
		Vector<Integer> birthdays = new Vector<Integer>();
		Vector<IntPair> ranges = new Vector<IntPair>();

		Scanner scanner = new Scanner(System.in);

		int bdaysCount = scanner.nextInt();

		for (int i = 0; i < bdaysCount; i++) {
			birthdays.add(scanner.nextInt());
		}

		int rangesCount = scanner.nextInt();

		for (int i = 0; i < rangesCount; i++) {
			IntPair pair = new IntPair();

			pair.start = scanner.nextInt();
			pair.end = scanner.nextInt();

			ranges.add(pair);
		}

		System.out.println("Result is:");
		Vector<Integer> result = BirthdayRanges.birthdaysCount(birthdays,
				ranges);

		for (int count : result) { // for each number in result -> do something
			System.out.print(count);
			System.out.print(", ");
		}
	}
}
