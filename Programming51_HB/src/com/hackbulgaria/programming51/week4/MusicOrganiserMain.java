package com.hackbulgaria.programming51.week4;

import java.util.ArrayList;

public class MusicOrganiserMain {

	public static void main(String[] args) {
		MusicOrganiser mo = new MusicOrganiser();

		mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
		mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
		mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
		mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));
		
		System.out.println(mo);

		System.out.println(mo.getCount());
		
		ArrayList<String> albums = mo.getAlbums();

		for(int i = 0; i < albums.size(); i++) {
		    System.out.println(albums.get(i));
		}
		
		System.out.println(mo.getAlbumsCount()); // 2
		
		ArrayList<Song> songs = mo.getAlbumSongs("The Marshall Mathers LP");

		for(int i = 0; i < songs.size(); i++) {
		    System.out.println(songs.get(i));
		}
		
		ArrayList<String> songs2 = mo.getAlbumsAndSongs();

		for(int i = 0; i < songs2.size(); i++) {
		    System.out.println(songs2.get(i));
		}
	}
}
