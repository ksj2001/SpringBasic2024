package testPerson;

import org.springframework.stereotype.Component;

//@Component("P") // Person�� �̸�: "P"
public class Person {
	private String name; // �̸�
	private int age; // ����
	private char gender; // ����
	private String phone; // ��ȭ��ȣ
	
	public Person() {}
	public Person(String name, int age, char gender, String phone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void printName() {
		System.out.println("�̸�: "+name);
	}
	public void printAge() {
		System.out.println("����: "+age);
	}
	public void printGender() {
		System.out.println("����: "+gender);
	}
	public void printPhone() {
		System.out.println("��ȭ��ȣ: "+phone);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
