package com.hackbulgaria.programming51.week6;

public class Shotgun implements Weapon {
	
	private int damage;
	private int durability;
	private int maxDurability;
	private String type;
	public String name = "shotgun";
	
	public Shotgun() {
		damage = 25;
		durability = 10;
		maxDurability = 10;
		type = "TO_SHOOT";
	}

	@Override
	public int getDamage() {
		durability -= 1;
		if (durability == 0) {
			damage = 1;
		}
		return damage;
	}

	@Override
	public int getDurability() {
		return durability;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getName() {
		return name;
	}

}
