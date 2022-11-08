package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//1. 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
		//2. DI - 스프링 컨테이너에서 빈을 가져오기
		MemberDao dao = context.getBean("dao",MemberDao.class);
										//MemberDao => memberDao
		
		dao.insert();
		
		
	}

}
