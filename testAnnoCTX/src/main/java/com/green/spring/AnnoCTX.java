package com.green.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // AnnoCTX.xml�� ���� ������ �ϰ� ���ִ� Annotation�̴�. 
public class AnnoCTX {
    //	<bean id="person1" class="com.green.spring.Person">
	@Bean
	public Person person1() {
		// <property name="name" value="���и�"/>
		Person person = new Person();
		person.setName("���и�");
		person.setAge(20);
		return person;
	}
	
	@Bean
	// <bean id="person2" class="com.green.spring.Person">
	public Person person2() {
		Person person = new Person();
		person.setName("���ӽ�");
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
