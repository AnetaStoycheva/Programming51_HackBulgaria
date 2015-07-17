package com.hackbulgaria.programming51.week6;

import java.util.Scanner;

public class ZombieMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zombieCount = scanner.nextInt();
		int zombieHealth = scanner.nextInt();
		String weaponName = scanner.next();
		Weapon[] weapons = {new Axe(), new AncientSword(), new Shotgun(), new Revolver()};
		
		Weapon weapon = null;
		
		for (Weapon w : weapons) {
			if (w.getName().equals(weaponName)) {
				weapon = w;
			}
		}
		int counter = 0;
		for (int i = 0; i < zombieCount; i++) {
			Zombie zombie = new TheZombie(zombieHealth);
			while (!zombie.isDead()) {
				zombie.hit(weapon.getDamage());
				counter++;
			}
		}
		System.out.println(counter);

	}

}
