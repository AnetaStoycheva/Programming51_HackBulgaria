package com.hackbulgaria.programming51.week6.zombieapocalypse;

public class ToShoot extends Weapon {
	public ToShoot (int damage, int durability) {
		super(damage, durability);
}
	
	@Override
	public int hit() {
		int dmg = getDamage();
		int dur = getDurability();

		if (dur > 0) {
			dur--;
		}

		if (dur == 0) {
			dmg = 1;
		}
		return dmg;
	}
	
	@Override
	public String getType() {
		return "TO_SHOOT";
	}
}