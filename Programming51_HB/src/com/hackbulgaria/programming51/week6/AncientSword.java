package com.hackbulgaria.programming51.week6;

public class AncientSword implements Weapon {
	
	private int damage;
	private int durability;
	private int maxDurability;
	private String type;
	public String name = "sword";
	
	public AncientSword() {
		damage = 50;
		durability = 10;
		maxDurability = 10;
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
