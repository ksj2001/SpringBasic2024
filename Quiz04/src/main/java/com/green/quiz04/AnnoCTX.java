package com.green.quiz04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AnnoCTX {
	@Bean
	public Gun gun() {
		Gun gun = new Gun();
		gun.setModel("����Ÿ");
		gun.setBullet(6);
		
		return gun;
	}
}
