package com.green.AnnoCTX03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac =
				new AnnotationConfigApplicationContext(AnnoCTX03.class);
		
		Student student = acac.getBean("student",Student.class);
		student.studentInfo();
		acac.close();
	}

}
