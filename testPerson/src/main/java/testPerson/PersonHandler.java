package testPerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonHandler {
    //@Qualifier("P") // Component���� ������ �̸� "P"�� �ڵ� �����ϵ��� ���
	@Autowired
	private Person person;
	
	public PersonHandler() {}
	public PersonHandler(Person person) {
		this.person = person;
		// Person Ŭ������ �ִ� getter�� �־����� ������ ���� �߻�
		person.getName();
		person.getAge();
		person.getGender();
		person.getPhone();
	}
	public void print() {
		person.printName();
		person.printAge();
		person.printGender();
		person.printPhone();
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
