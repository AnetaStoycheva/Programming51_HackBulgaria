package com.hackbulgaria.programming51.week4;

public class Song {
	
	private String name = "";
	private String artist = "";
	private int duration = 1;
	private String album = "";
	
	public Song(String name, String artist, int duration, String album) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}
	
	public String toString() {
		return "Song: " + getName() + ", artist: " + getArtist() + ", duration: " + getDuration() + ", from album: " + album + "\n"; 
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public int getDuration() {
		return duration;
	}

	public String getAlbum() {
		return album;
	}
}
