package com.green.quiz04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PoliceMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac = 
				new GenericXmlApplicationContext("classpath:appCTX.xml");
		Police police = gxac.getBean("police",Police.class);
		police.policeInfo();
		gxac.close();
	}

}
