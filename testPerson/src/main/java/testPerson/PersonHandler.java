package testPerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonHandler {
    //@Qualifier("P") // Component에서 지정한 이름 "P"를 자동 주입하도록 명시
	@Autowired
	private Person person;
	
	public PersonHandler() {}
	public PersonHandler(Person person) {
		this.person = person;
		// Person 클래스에 있는 getter를 넣어주지 않으면 오류 발생
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
