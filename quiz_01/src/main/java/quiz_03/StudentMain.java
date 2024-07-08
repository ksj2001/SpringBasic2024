package quiz_03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
			new GenericXmlApplicationContext("classpath:appContext.xml");
		Student student = gxac.getBean("student",Student.class);
		student.studentInfo();
		gxac.close();
	}
}
