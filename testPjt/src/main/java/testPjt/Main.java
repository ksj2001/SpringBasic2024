package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		TransportationWork tk = new TransportationWork();
//		tk.Move();
		
//		applicationContext.xml 컨테이너에 접근하는 방식
//		GenericXmlApplicationContext는 applicationContext.xml에 접근하는 클래스이다.
//		gxt.getBean()을 사용하는 이유는 applicationContext.xml의 여러개의 bean 객체 중에 
//		사용하고 싶은 객체를 가져오는 메서드이기 때문이다.
		GenericXmlApplicationContext gxt = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWork tk = gxt.getBean("tWalk",TransportationWork.class);
		tk.Move();
		
		// 자원 반납
		gxt.close();
	}
}
