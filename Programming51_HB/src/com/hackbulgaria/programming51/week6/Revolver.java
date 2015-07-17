package com.hackbulgaria.programming51.week6;

public class Revolver implements Weapon {

	private int damage;
	private int durability;
	private int maxDurability;
	private String type;
	public String name = "revolver";

	public Revolver() {
		damage = 15;
		durability = 6;
		maxDurability = 6;
		type = "TO_SHOOT";
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 15;
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
