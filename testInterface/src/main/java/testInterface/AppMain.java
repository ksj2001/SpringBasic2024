package testInterface;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = 
				new GenericXmlApplicationContext("classpath:appContext.xml");
		App app = gxac.getBean("game",App.class);
		app.play();
		
		gxac.close();
		

	}

}
