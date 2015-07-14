package com.hackbulgaria.programming51.week6;

import java.util.Vector;

public class Landscape {
	Vector<Tile> tile = new Vector<Tile> ();
	
	public void addTile(Tile t) {
		tile.add(t);
	}
	
	public String renderAll() {
		String result = "";
		for (Tile newTile : tile) {
			result += newTile.render();
		}
		return result;
	}
}
