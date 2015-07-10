package com.hackbulgaria.programming51.week5;

import java.util.Scanner;
import java.util.Vector;

public class GasStations {

	public static Vector<Integer> getGasStations(int tripDistance, int tankSize, Vector<Integer> gasStations) {
		
		Vector<Integer> result = new Vector<Integer>();
		int temp = tankSize;
		gasStations.add(tripDistance);
		Vector<Integer> distances = new Vector<>();
		distances.add(gasStations.get(0));
		for (int i = 1; i < gasStations.size(); i++) {
			distances.add(gasStations.get(i) - gasStations.get(i - 1));
		}
		
		for (int i = 0; i < distances.size(); i++) {
			if (temp < distances.get(i)) {
				temp = tankSize;
				result.add(gasStations.get(i - 1));
			}
			temp -= distances.get(i);
		}
		return result;
	  }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tripDistance = scanner.nextInt();
		int tankSize = scanner.nextInt();

		int gasStationsCount = scanner.nextInt();
		Vector<Integer> gasStations = new Vector<Integer>();

		for (int i = 0; i < gasStationsCount; i++) {
			gasStations.add(scanner.nextInt());
		}

		Vector<Integer> result = getGasStations(tripDistance, tankSize, gasStations);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
