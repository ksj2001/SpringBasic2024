package testPerson;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:appContext.xml");
		
		PersonHandler ph = gxac.getBean("personHandle",PersonHandler.class);
		Person person1 = gxac.getBean("person",Person.class);
		person1.setName("제임스");
		person1.setAge(25);
		person1.setGender('남');
		person1.setPhone("111-111-1111");
		ph.print();
		
		System.out.println("====================");
//		PersonHandler ph2 = gxac.getBean("personHandle2",PersonHandler.class);
		Person person2 = gxac.getBean("person",Person.class);
		person2.setName("엘리스");
		person2.setAge(32);
		person2.setGender('여');
		person2.setPhone("555-555-5555");
		ph.print();
		
		gxac.close();
	}
}
