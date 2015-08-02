package com.hackbulgaria.programming51.week6.zombieapocalypse;

public abstract class Weapon {
	private int damage;
	private int durability;
	private int maxDurability;
	
	public Weapon(int damage, int durability) { // pravim si konstructor, za6toto ina4e prezapisva
		this.damage = damage;
		this.durability = durability;
		this.maxDurability = durability;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public void setDurabilitgy(int durability) {
		this.durability = durability;
	}
	
	public int getMaxDurability() {
		return maxDurability;
	}
	
	public abstract int hit(); // Nothing
	
	public abstract String getType();
}
