package Chapter09.EX02;

import Chapter09.EX01.A;

//class D는 class A를 상속 받는다. (패키지 외부에서 상속 설정)
	//D class는 A class의 필드와 메소드를 상속 받는다.

//protected 접근 제어자 : 상속 관계가 있을때만 외부 패키지에서 접근 가능 

public class D extends A {

	public void print() {
		System.out.println(a);	//public		다른 패키지에서 접근됨
		System.out.println(b);	//protected		다른 패키지에서 접근됨(상속받아 허용)
//		System.out.println(c);	//private	접근 불가
//		System.out.println(d);	//default	접근 불가
		
		System.out.println("--부모 클래스의 메소드 출력(다른 패키지)--");
		print();	//public
		print1();	//protected
//		print2();	//private
//		print3();	//default
		
		System.out.println("------상속 관계 객체 출력 (D)-----");
		D d=new D();
		
		d.print();
		
	}
	
	
}
