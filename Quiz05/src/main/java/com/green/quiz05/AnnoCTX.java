package com.green.quiz05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:appCTX.xml")
public class AnnoCTX {
	@Autowired
	Engine engine;
	
	@Bean
	public Car car() {
		Car car = new Car();
		
		car.setModel("520d");
		car.setEngine(engine);
		
		return car;
	}
}
