package com.green.person2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:pCTX.xml")
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
