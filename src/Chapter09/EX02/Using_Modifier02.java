package Chapter09.EX02;

import Chapter09.EX01.A;

//A클래스와 다른 패키지에 존재하는 클래스 : import 를 사용

public class Using_Modifier02 {

	public static void main(String[] args) {
		
		//import 됨
		A a=new A();
		
		//필드 접근
		System.out.println(a.a);	//public
//		System.out.println(a.b);	//protected : 접근 불가능. 다른 패키지에서 접근할 경우 상속관계여야함
//		System.out.println(a.c);	//private : 같은 파일이 아닌 이상 접근 불가능
//		System.out.println(a.d);	//default : 다른 패키지이므로 접근 불가능
		
		//메소드 접근
		a.print();
//		a.print1();		//protected : 접근 불가능. 다른 패키지에서 접근할 경우 상속관계여야함
//		a.print2();		//private : 같은 파일이 아닌 이상 접근 불가능
//		a.print3();		//default : 다른 패키지이므로 접근 불가능
			
	}

}
