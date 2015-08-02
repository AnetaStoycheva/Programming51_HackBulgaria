package com.hackbulgaria.programming51.week6.zombieapocalypse;

import java.util.Scanner;
import java.util.Vector;

public class ZombieMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ZombiesCount = scanner.nextInt();
		int ZombiesHealth = scanner.nextInt();

		String weapon = scanner.next();
		Weapon a;

		switch (weapon) {
		case "Axe": {
			a = new Axe();
			break;
		}
		case "Shotgun": {
			a = new Shotgun();
			break;
		}
		case "AncientSword": {
			a = new AncientSword();
			break;
		}
		case "Revolver": {
			a = new Revolver();
			break;
		}
		default: {
			System.out.println("Invalid weapon!");
			return;
		}
		}

		Vector<Zombie> zombies = new Vector<>();

		for (int i = 0; i < ZombiesCount; i++) {
			zombies.add(new ZombieOneKind(ZombiesHealth));
		}

		int counter = 0;
		for (int i = 0; i < zombies.size(); i++) {
			Zombie current = zombies.get(i);
			while (!current.isDead()) {
				current.hit(a.hit());
				counter++;
				System.out.println("health: " + current.getCurrentHealth());
			}
			System.out.println(i + " " + counter);
		}
		System.out.println(counter);

	}

}
