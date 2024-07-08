package testCal;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		MyCalculator mycal = gxac.getBean("myCalc",MyCalculator.class);
		//Calculator cal = gxac.getBean("calc",Calculator.class);
		mycal.setNum1(10);
		mycal.setNum2(3);
		mycal.add();
		
		
//		mycal1.setCal(new Calculator()); // 주입(DI)
//		mycal1.add();
//		mycal1.sub();
//		mycal1.mul();
//		mycal1.div();
//		System.out.println("==========================");
//		MyCalculator mycal2 = gxac.getBean("myCalc2",MyCalculator.class);
////		mycal2.setNum1(100);
////		mycal2.setNum2(30);
////		mycal2.setCal(new Calculator()); // 주입(DI)
//		mycal2.add();
//		mycal2.sub();
//		mycal2.mul();
//		mycal2.div();
		
		gxac.close();
	}
}
