package com.green.spring;

public class PersonHandler {
	private Person person;
	
	public PersonHandler() {}
	public PersonHandler(Person person) {
		this.person = person;
	}
	
	public void personInfo() {
		System.out.println("�̸�: "+person.getName());
		System.out.println("����: "+person.getAge());
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
