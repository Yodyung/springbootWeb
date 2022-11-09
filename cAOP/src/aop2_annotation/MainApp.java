package aop2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		//1. 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2_annotation/applicationContext.xml");

		MessageBean bean = context.getBean("targetBean", MessageBean.class);

		bean.sayHello();
		System.out.println("---------------------");		
		bean.enSayHello();
		System.out.println("---------------------");
		bean.test();
	}

}
