package com.green.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// @Configuration 안에 @Bean 객체를 접속해준다. 
		AnnotationConfigApplicationContext acac 
		= new AnnotationConfigApplicationContext(AnnoCTX01.class);
        PersonHandler personHandle1 = acac.getBean("personHandle1",PersonHandler.class);
        personHandle1.personInfo();
        PersonHandler personHandle2 = acac.getBean("personHandle2",PersonHandler.class);
        personHandle2.personInfo();
        acac.close();
	}

}
