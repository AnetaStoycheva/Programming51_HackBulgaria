package com.hackbulgaria.programming51.week4;

import java.util.ArrayList;

public class MusicOrganiser {
	
	public ArrayList<Song> songs = new ArrayList<Song>();
	
	public void addSong(Song s) {
		songs.add(s);
	}
	
	public int getCount() {
		return songs.size();
	}
	
	public ArrayList<String> getAlbums() {
		ArrayList<String> result = new ArrayList<>();
		
		for (int i = 0; i < songs.size(); i++) {
			
			if (!(result.contains(songs.get(i).getAlbum()))) {
				result.add(songs.get(i).getAlbum());
			}
		}
		return result;
	}
	
	public int getAlbumsCount(){
		return getAlbums().size();
	}
	
	public ArrayList<Song> getAlbumSongs(String album) {
		ArrayList<Song> result = new ArrayList<Song>();
		for (Song song: songs) {
			if (song.getAlbum().equals(album)) {
				result.add(song);
			}
		}
		return result;
	}
	
	public ArrayList<String> getAlbumsAndSongs() {
		ArrayList<String> result = new ArrayList<>(); 
		ArrayList<String> albums = new ArrayList<String>();
		ArrayList<Integer> songsCounter = new ArrayList<Integer>();
		for (Song song: songs) {
			boolean albumFound = false;
			for (int i = 0; i < albums.size(); i++) {
				if (song.getAlbum().equals(albums.get(i))) {
					songsCounter.set(i, songsCounter.get(i) + 1);
					albumFound = true;
				}
			}
			if (!albumFound) {
				albums.add(song.getAlbum());
				songsCounter.add(1);
			}
		}
		for (int i = 0; i < albums.size(); i++) {
			result.add(albums.get(i) + "(" + songsCounter.get(i) + ")");
		}
		return result;
	}
	
	public String toString() {
		return songs.toString();
	}
}
