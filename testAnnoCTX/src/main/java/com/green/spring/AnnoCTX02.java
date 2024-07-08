package com.green.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoCTX02 {
	// Autowired ������̼��� �̿��Ͽ� person1�̶�� id�� ���� Bean ��ü�� �ڵ� �����Ѵ�.
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
