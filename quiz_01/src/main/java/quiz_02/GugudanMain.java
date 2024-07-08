package quiz_02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class GugudanMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:appContext.xml");
		Gugudan gugudan = gxac.getBean("gugudan",Gugudan.class);
		gugudan.gugudanInfo();
		gxac.close();
	}

}
