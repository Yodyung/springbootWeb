package Chapter07.EX02;

//class 외부에 올 수 있는 것(3가지) : 패키지, 임포트(같은 패키지에 존재하지 않는 클래스), 외부 클래스

class A{		//클래스 : 객체를 생성하기 위한 설계도
	//클래스 내부에 올 수 있는 것(4가지) : 필드(클래스에서 선언된 변수들), 생성자, 메소드, 이너 클래스
	//필드 : 클래스 군락에서 선언 된 변수들
	int m;		//heap 영역에 저장, 값을 정해주지 않으면 강제 초기화가 됨
	int n;		// 0
	double k;	// 0.0
	String l;	// null
				
	//생성자 : 클래스는 반드시 생성자가 존재해야 한다. (기본 생성자(입력 매개 변수가 없는 생성자)는 생략이 가능함) ex) A(){}
	//	1. 클래스 이름과 동일, 2.리턴이 존재하지 않아야 한다.
	// 객체 생성 시 생성자 호출. 객체의 초기 값을 세팅.
	//기본 생성자는 생략되어 있을 경우 컴파일러가 자동으로 등록해 준다.
	// 클래스 내부의 다른 생성자가 존재할 시 컴파일러가 기본 생성자를 자동으로 만들어 주지 않는다.
	A(){
		System.out.println("기본 생성자 호출");
	}
	
	//메소드 : 리턴타입 메소드명 (입력 매개변수) {실행코드;}
	//프로그램의 기능을 코드로 작성
	//반드시 호출해서 작동됨, work1()
	void work1() {
		//리턴 타입이 없는 메소드 명 : void
		System.out.println("work1 메소드 호출-------------");
	}
	
	// work2(정수, 정수)
	int work2(int a, int b) {		//지역 변수 : 메소드 클릭에서 선언된 변수, stack에 값이 들어감
									//메소드가 종료되면 없어짐.
		System.out.println("work2 메소드 호출--------------");
		
		return a+b;
	}
	
	//work3(정수, 더블, 문자열
	double work3(int a, double b, String l) {
		System.out.println("work3 메소드 호출---------------");
		System.out.println(a+" , "+b+" , "+l);
		return a+b;
	}
	
	String work4(String a) {
		
		return a;
	}
	
}


public class Using_Object {

	public static void main(String[] args) {
		// 객체 생성 : main method에서 생성해야 함 (클래스를 먼저 만들어야 사용할 수 있음)

		//객체 생성
		A a1 = new A();
		//A : class
		//a1 : 객체
		//new : 객체를 생성해라, heap 영역에 객체를 생성해라.
		//A() : 클래스 내부의 생성자 호출 기본생성자 : 입력 매개 변수가 없는 생성자(생략 가능)
		
		//객체의 필드 값 출력
		System.out.println(a1.m);	// 0
		System.out.println(a1.n);	// 0
		System.out.println(a1.k);	// 0.0
		System.out.println(a1.l);	//null
		System.out.println("-------------------------------------");
		
		//객체의 필드의 값을 수정
		a1.m=10;
		a1.n=20;
		a1.k=30.0;
		a1.l="안녕하세요";
		
		System.out.println(a1.m);	// 0
		System.out.println(a1.n);	// 0
		System.out.println(a1.k);	// 0.0			System.out.println(a1.l);	//null
		System.out.println(a1.l);	//null
		System.out.println("-------------------------------------");
		
		//메소드 호출1
		a1.work1(); 		//매개 변수가 존재하지 않는 메소드
		
		//메소드 호출2 (work2 (정수,정수))
		int k=a1.work2(7, 10);	// 매개 변수가 2개인 메소드 호출 return a+b; 
		System.out.println(k);
		System.out.println(a1.work2(40, 50));
		
		//메소드 호출3 (work3) (work3(정수,더블,문자열)) - 리턴 double
		double d=a1.work3(10, 22.2, "오늘");
		System.out.println(d);
		System.out.println(a1.work3(10, 100.0, "내일"));
		System.out.println("-------------------------------------");
		
		//메소드 호출4 (work4) 문자열 - 리턴 String
		
		String s=a1.work4("하이루");		//리턴값을 변수에 저장 후 출력
		System.out.println(s);
		System.out.println(a1.work4("방가방가햄토리"));		//인풋값을 리턴 받음
		
		//클래스 : 객체를 생성하기 위한 설계도
		//객체 : 클래스를 기반으로 만들어진 인스턴스(객체) <== heap 메모리에 로드 됨
		//인스턴스화 : 클래스는 객체화 해야 사용 가능하다.
		
		A a2=new A();
		A a3=new A();
		A a4=new A();
		A a5=new A();		//클래스 하나로 무한복제가 가능하다.
	}

}
