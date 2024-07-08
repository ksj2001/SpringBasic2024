package testMap;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:appContext.xml");
		TestMap testMap = gxac.getBean("map",TestMap.class);
		testMap.mapInfo();
		gxac.close();
	}

}
