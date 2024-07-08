package quiz_01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:appContext.xml");
		Person person = gxac.getBean("person",Person.class);
		person.personInfo();
		gxac.close();
	}

}
