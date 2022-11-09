package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//빈 생성하라는 골뱅쓰
@Aspect
@Order(2)
//얘를 써줘야 어드바이스 되는 관점이 되는 클래스가 됨
public class LoggingAdvice {

		@Before("execution(public * aop2_annotation.*.*Hello(..))")
		public void before(JoinPoint point)throws Throwable{
			String methodName = point.getSignature().getName();
			System.out.println("[********사전작업*********]"+methodName);	
		}

		@After("execution(public * aop2_annotation.*.*Hello(..))")
		public void after(JoinPoint point)throws Throwable{
			String methodName = point.getSignature().getName();
			System.out.println("[********사후작업*********]"+methodName);	
		}
}
