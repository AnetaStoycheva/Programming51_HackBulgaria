package com.hackbulgaria.programming51.week6;

public class Axe implements Weapon {
	
	private int damage;
	private int durability;
	private int maxDurability;
	private String type;
	public String name = "axe";
	
	public Axe() {
		damage = 10;
		durability = 50;
		maxDurability = 50;
		type = "TO_SMASH";
	}

	@Override
	public int getDamage() {
		durability -= 1;
		if (durability < maxDurability / 2) {
			damage -= 1;
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
