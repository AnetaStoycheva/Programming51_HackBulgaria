package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class VectorOfVectorsMain {

	public static void main(String[] args) {

		Vector<Vector<Integer>> vi = new Vector<>();
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Vector<Integer> v = new Vector<Integer>();
			int num = scanner.nextInt();
			for (int k = 0; k < num; k++) {
				v.add(scanner.nextInt());
			}
			vi.add(v);
		}
		System.out.println(VectorOfVectors.sortAndUnique(vi));
	}
}
