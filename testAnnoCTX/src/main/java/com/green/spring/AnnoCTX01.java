package com.green.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AnnoCTX02.class)
public class AnnoCTX01 {
	@Bean
	public Person person1() {
		Person person = new Person();
		person.setName("에밀리");
		person.setAge(20);
		return person;
	}
	
	@Bean
	public Person person2() {
		Person person = new Person();
		person.setName("제임스");
		person.setAge(30);
		return person;
	}
}
