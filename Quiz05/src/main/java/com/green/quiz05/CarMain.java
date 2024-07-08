package com.green.quiz05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = 
				new AnnotationConfigApplicationContext(AnnoCTX.class);
		Car car = acac.getBean("car",Car.class);
		car.carInfo();
		acac.close();
	}

}
