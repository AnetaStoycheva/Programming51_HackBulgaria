package com.hackbulgaria.programming51.week6.zombieapocalypse;

public class ToSmash extends Weapon {
	public ToSmash(int damage, int durability) {
		super(damage, durability);
	}
	
	@Override
	public int hit() {
		int dmg = getDamage();
		int dur = getDurability();
		
		if (dur > 0) {
			dur--;
		}
		
		if (dur <= getMaxDurability() / 2 && dmg > 1) {
			setDamage(dmg - 1);;
		}
		
		setDurabilitgy(dur);
		
		return dmg;
	}

	@Override
	public String getType() {
		return "TO_SMASH";
	}
}
