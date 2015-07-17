package com.hackbulgaria.programming51.week6;

public class TheZombie implements Zombie {
	private int health;
	private int currentHealth;

	public TheZombie(int zombieHealth) {
		this.health = zombieHealth;
		this.currentHealth = zombieHealth;
	}

	@Override
	public int getTotalHealth() {
		return health;
	}

	@Override
	public int getCurrentHealth() {
		return currentHealth;
	}

	@Override
	public void hit(int damage) {
		currentHealth -= damage;
	}

	@Override
	public boolean isDead() {
		return getCurrentHealth() <= 0;
	}
}
