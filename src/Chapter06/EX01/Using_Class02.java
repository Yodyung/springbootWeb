package Chapter06.EX01;

//클래스(붕어빵 기계)와 객체(붕어빵)의 차이점
//클래스 : 객체를 만들기 위한 틀, 붕어빵기계, 설계도
	//필드:
	//생성자 :
	//메소드 : 
	//이너클래스	
//객체(인스턴스) : 클래스를 통로해서 만들어진 RAM에 로드된 객체, 붕어빵, 건물

//클래스를 객체로 만드는 작업을 인스턴스화 라고 부름.

//외부 클래스
class A {
	//필드 : heap공간에 값이 저장됨, 값을 넣지 않으면 강제 초기화 됨
	int m=3;
	int n=4;

	//기본 생성자 : 클래스 이름과 동일한 메소드를 생성자, 리턴타입이 없다.
		//객체를 생성할 때 초기값을 부여하는 역할을 합니다.
	A(){}	//생성자
	
	//메소드 : 호출 시 작동이 됨.
	void print() {
		int k=10;		//지역변수 : Stack공간에 값이 저장됨, 값을 넣지 않으면 비어있다.
		System.out.println(k);
		System.out.println(m+n);
	}

}																			

class B {
	
}


public class Using_Class02 {


	public static void main(String[] args) {
		
		int aa ;		//지역변수
		
		// 객체 생성은 main 메소드에서 작성
		
		A a= new A();
		//A : 참조 변수 타입
		//a : 객체 (참조변수)
		//new : Heap 메모리에 값을 넣어라. 객체를 생성해라.
		//A() : 기본 생성자 호출
		
		//객체의 필드 내용 출력 (a.m, a.n)
		System.out.println("---객체의 필드 값 출력---");
		System.out.println(a.m); //필드의 m 값을 출력
		System.out.println(a.n); //필드의 n 값을 출력
		
		//객체의 메소드 호출 (a.print())
		System.out.println("---객체의 메소드 호출---");
		a.print();
		//=========================================================
			//A class : 틀 ===> 객체화
		
		//A클래스를 틀로 해서 b 객체를 생성
		A b = new A();
		
		System.out.println(b.m);	//3
		System.out.println(b.n);	//4
		
		//객체의 필드 값을 수정
		b.m = 30;		//필드의 값을 수정.
		b.n = 40;		//필드의 값을 수정.
		
		//필드의 내용을 출력
		System.out.println(b.m);	//30
		System.out.println(b.n);	//40
		
		//메소드 호출 : 기능을 프로그래밍한 것
		System.out.println("====print() 메소드 호출====");
		b.print();
		
		System.out.println("===============================================");
		//A class를 틀로해서 객체를 무한정 생성
		A c = new A();
		
		System.out.println(c.m);
		System.out.println(c.n);
		c.print();
		
		A d = new A();
		
		System.out.println(d.m);
		System.out.println(d.n);
		d.print();
		
		
	}

}
