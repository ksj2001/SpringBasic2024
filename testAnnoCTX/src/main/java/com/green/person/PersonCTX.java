package com.green.person;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonCTX {
	@Bean
	public Person person2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("��");
		
		Person person = new Person();
		person.setName("���ӽ�");
		person.setHobbies(list);
		
		return person;
	}
}
