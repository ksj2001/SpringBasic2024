package testPerson;

import org.springframework.stereotype.Component;

//@Component("P") // Person의 이름: "P"
public class Person {
	private String name; // 이름
	private int age; // 나이
	private char gender; // 성별
	private String phone; // 전화번호
	
	public Person() {}
	public Person(String name, int age, char gender, String phone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void printName() {
		System.out.println("이름: "+name);
	}
	public void printAge() {
		System.out.println("나이: "+age);
	}
	public void printGender() {
		System.out.println("성별: "+gender);
	}
	public void printPhone() {
		System.out.println("전화번호: "+phone);
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
