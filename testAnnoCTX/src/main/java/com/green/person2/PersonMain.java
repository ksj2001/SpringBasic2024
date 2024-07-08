package com.green.person2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
//		GenericXmlApplicationContext gxac
//		= new GenericXmlApplicationContext("classpath:pCTX.xml");
		AnnotationConfigApplicationContext acac
		= new AnnotationConfigApplicationContext(PersonCTX.class);
		
		Person person1 = acac.getBean("person1",Person.class);
		System.out.println("�̸�: "+person1.getName());
		System.out.println("���: "+person1.getHobbies());
		
		Person person2 = acac.getBean("person2",Person.class);
		System.out.println("�̸�: "+person2.getName());
		System.out.println("���: "+person2.getHobbies());
		
		acac.close();
	}

}
