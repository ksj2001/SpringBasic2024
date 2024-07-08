package com.green.AnnoCTX02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingerMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac
			= new AnnotationConfigApplicationContext(AnnoCTX02.class);
		
		Singer singer = acac.getBean("singer",Singer.class);
		singer.singerInfo();
		acac.close();
	}
}
