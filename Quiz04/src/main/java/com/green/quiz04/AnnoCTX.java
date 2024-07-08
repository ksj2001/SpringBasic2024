package com.green.quiz04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AnnoCTX {
	@Bean
	public Gun gun() {
		Gun gun = new Gun();
		gun.setModel("º£·¹Å¸");
		gun.setBullet(6);
		
		return gun;
	}
}
