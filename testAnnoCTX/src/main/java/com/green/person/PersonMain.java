package com.green.person;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac
		= new GenericXmlApplicationContext("classpath:pCTX.xml");
		
		Person person1 = gxac.getBean("person1",Person.class);
		System.out.println("이름: "+person1.getName());
		System.out.println("취미: "+person1.getHobbies());
		
		Person person2 = gxac.getBean("person2",Person.class);
		System.out.println("이름: "+person2.getName());
		System.out.println("취미: "+person2.getHobbies());
	}

}
