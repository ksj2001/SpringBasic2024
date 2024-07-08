package com.green.AnnoCTX02;

public class Singer {
	private String name;
	private Song song;
	
	public Singer() {}
	public Singer(String name, Song song) {
		this.name = name;
		this.song = song;
	}
	
	public void singerInfo() {
		System.out.println("���� �̸�: "+name);
		song.songInfo();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
}
