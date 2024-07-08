package com.green.AnnoCTX02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoCTX02 {
	@Bean
	public Song song() {
		Song song = new Song();
		song.setTitle("Hello");
		song.setGenre("Balad");
		song.setPlayTime(4.5);
		return song;
	}
	
	@Bean
	public Singer singer() {
		Singer singer = new Singer();
		singer.setName("Abba");
		singer.setSong(song());
		return singer;
	}
}
