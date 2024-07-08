package com.green.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // AnnoCTX.xml와 같은 역할을 하게 해주는 Annotation이다. 
public class AnnoCTX {
    //	<bean id="person1" class="com.green.spring.Person">
	@Bean
	public Person person1() {
		// <property name="name" value="에밀리"/>
		Person person = new Person();
		person.setName("에밀리");
		person.setAge(20);
		return person;
	}
	
	@Bean
	// <bean id="person2" class="com.green.spring.Person">
	public Person person2() {
		Person person = new Person();
		person.setName("제임스");
		person.setAge(30);
		return person;
	}
	//<bean id="personHandle1" class="com.green.spring.PersonHandler">
	@Bean
	public PersonHandler personHandle1() {
		PersonHandler personHandle = new PersonHandler();
		// <property name="person" ref="person1"/>
		personHandle.setPerson(person1());
		return personHandle;
	}
	
	@Bean
	public PersonHandler personHandle2() {
		PersonHandler personHandle = new PersonHandler();
		personHandle.setPerson(person2());
		return personHandle;
	}
}
