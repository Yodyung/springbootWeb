package Chapter09.EX05;

class B{
	
	int a=10;			//인스턴스 필드
	static int b=20;	//정적 필드
	
	void abc() {	//인스턴스 메소드 : 객체를 생성 후 사용
					//인스턴스 필드, 정적 필드, 인스턴스 메소드, 정적 메소드
		System.out.println(a);	//인스턴스 필드
		System.out.println(b);	//정적 필드
		cde();	//인스턴스 메소드
		bcd();	//정적 메소드
	}
	
	static void bcd() {		//정적 메소드 : 객체 생성 후 호출, 객체 생성 없이도 호출
								// - 정적 필드, 정적 메소드
		//정적 메소드는 객체 생성 없이 사용이 가능하다. 그런데 인스턴스 필드나, 인스턴스 메소드는 객체를 생성해야만 사용 가능함.
		System.out.println("정적 메소드-bcd()");	
//		System.out.println(a);		//인스턴스 필드 올 수 없음.
		System.out.println(b);		//정적 필드 올 수 있음.
//		cde();						//인스턴스 메소드 올 수 없음.
		def();						//정적 메소드 올 수 있음.
	}
	void cde() {		//인스턴스 메소드
		System.out.println("인스턴스 메소드-cde()");
	}
	static void def() {
		System.out.println("정적 메소드-def()");
	}
}

public class Using_StaticMethod02 {		
	

	public static void main(String[] args) {
		// 객체 생성 없이 바로 호출 : static 필드, static 메소드
			//클래스명.필드명, 클래스명.메소드명()
		System.out.println("--------------------------------");
//		System.out.println(B.a);	//오류남! 인스턴스 필드
		System.out.println(B.b);
//		B.abc();					//오류남! 인스턴스 메소드
		B.bcd();
//		B.cde();					//오류남! 인스턴스 메소드
		B.def();
		
		System.out.println("--------------------------------");
		//인스턴스 필드, 정적 필드 모두 호출 됨.
		B b=new B();
		
		System.out.println(b.a);	// 인스턴스 필드
		System.out.println(b.b);
		b.abc();					// 인스턴스 메소드
		b.bcd();
		b.cde();					// 인스턴스 메소드
		b.def();
		
		
		
	}

}
