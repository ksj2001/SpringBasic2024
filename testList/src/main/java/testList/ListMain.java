package testList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:appContext.xml");
		
		ListArray listArray = gxac.getBean("listArray",ListArray.class);
		
		listArray.ListArrayInfo();
		
		gxac.close();

	}

}
