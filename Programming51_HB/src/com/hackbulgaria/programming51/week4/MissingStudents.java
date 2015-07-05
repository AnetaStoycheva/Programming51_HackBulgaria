package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MissingStudents {

	private static Vector<String> differenceOfVectors(Vector<String> students, Vector<String> available) {
		Vector<String> result = new Vector<>();
		int currentPosition = 0;
		for (String student: students) {
			if (currentPosition < available.size() && available.get(currentPosition).equals(student)) {
				currentPosition++;
			} else {
				result.add(student);
			}
		}
		return result;
	}
	
	public static Vector<Vector<String>> missingStudents(Vector<String> students, Vector<Vector<String>> presence) {
		Vector<Vector<String>> result = new Vector<>();

		Collections.sort(students);
		
		for (int i = 0; i < presence.size(); i++) {
			Collections.sort(presence.get(i));
			result.add(differenceOfVectors(students, presence.get(i)));
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<String> students = new Vector<>();
		Vector<Vector<String>> presence = new Vector<>();

		int studentsCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < studentsCount; i++) {
			String student = scanner.nextLine();
			students.add(student);
		}

		int days = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < days; i++) {
			int studentsForThatDay = Integer.parseInt(scanner.nextLine());
			Vector<String> presenceForDay = new Vector<>();
			for (int j = 0; j < studentsForThatDay; j++) {
				presenceForDay.add(scanner.nextLine());
			}

			presence.add(presenceForDay);
		}

		Vector<Vector<String>> missing = missingStudents(students, presence);

		System.out.println(missing);
	}
}
