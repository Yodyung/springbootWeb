package aop1_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		//1. 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("aop1_xml/applicationContext.xml");

		MessageBean bean = context.getBean("targetBean", MessageBean.class);

		bean.sayHello();
		System.out.println("---------------------");		
		bean.enSayHello();
		System.out.println("---------------------");
		bean.test();
	}

}
