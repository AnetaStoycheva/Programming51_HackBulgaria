package com.hackbulgaria.programming51.week6.zombieapocalypse;

public class ZombieOneKind implements Zombie {
	
	private int health;

	public ZombieOneKind(int zombieHealth) {
		this.health = zombieHealth;
	}

	@Override
	public int getTotalHealth() {
		return health;
	}

	@Override
	public int getCurrentHealth() {
		return health;
	}

	@Override
	public void hit(int damage) {
		health -= damage;
		if (health <= 0) {
			health = 0;
		}
	}

	@Override
	public boolean isDead() {
		return health == 0;
	}
}
