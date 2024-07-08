package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		TransportationWork tk = new TransportationWork();
//		tk.Move();
		
//		applicationContext.xml �����̳ʿ� �����ϴ� ���
//		GenericXmlApplicationContext�� applicationContext.xml�� �����ϴ� Ŭ�����̴�.
//		gxt.getBean()�� ����ϴ� ������ applicationContext.xml�� �������� bean ��ü �߿� 
//		����ϰ� ���� ��ü�� �������� �޼����̱� �����̴�.
		GenericXmlApplicationContext gxt = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWork tk = gxt.getBean("tWalk",TransportationWork.class);
		tk.Move();
		
		// �ڿ� �ݳ�
		gxt.close();
	}
}
