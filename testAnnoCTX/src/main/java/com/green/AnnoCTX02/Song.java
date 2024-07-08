package com.green.AnnoCTX02;

public class Song {
	private String title;
	private String genre;
	private double playTime;
	
	public Song() {}
	public Song(String title,String genre,double playTime) {
		this.title = title;
		this.genre = genre;
		this.playTime = playTime;
	}
	
	public void songInfo() {
		System.out.println("제목: "+title);
		System.out.println("장르: "+genre);
		System.out.println("런타임: "+playTime);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPlayTime() {
		return playTime;
	}
	public void setPlayTime(double playTime) {
		this.playTime = playTime;
	}
}
