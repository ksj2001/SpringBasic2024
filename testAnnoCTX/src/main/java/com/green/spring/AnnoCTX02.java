package com.green.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoCTX02 {
	// Autowired 어노테이션을 이용하여 person1이라는 id를 가진 Bean 객체를 자동 주입한다.
	// <bean id="person1" class="com.green.spring.Person">
	@Autowired
	Person person1;
	// <bean id="person2" class="com.green.spring.Person">
	@Autowired
	Person person2;
	
	@Bean
	public PersonHandler personHandle1() {
		PersonHandler personHandle = new PersonHandler();
		personHandle.setPerson(person1);
		return personHandle;
	}
	
	@Bean
	public PersonHandler personHandle2() {
		PersonHandler personHandle = new PersonHandler();
		personHandle.setPerson(person2);
		return personHandle;
	}
}
