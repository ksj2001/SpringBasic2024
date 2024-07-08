package testDisunite;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		String[] a = {"appCTX1.xml","appCTX2.xml"};
		String b1= "appCTX1.xml";
		String b2 = "appCTX2.xml";
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext(b1,b2);
		Person person = gxac.getBean("person",Person.class);
		person.personInfo();
		gxac.close();
	}

}
