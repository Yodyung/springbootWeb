package Chapter10.EX05;

//메소드 오버 로딩(Method_Overloading) : 
//		- 동일한 메소드 이름에 대해서 시그니처가 다를 경우 다른 메소드로 식별하는 것.
//		- 시그니처 : 메소드의 입력매개변수의 갯수, 타입
//					리턴타입은 시그니처에 포함되지 않습니다.
//		- 생성자, 메소드

//메소드 오버 라이딩(Method_Overriding) : 상속관계일때만 사용 가능
//		- 부모의 메소드를 자식 클래스에서 새롭게 정의해서 사용하는 것
//		- 자식 클래스에서 부모의 메소드를 오버라이딩 하기 위한 조건
//		1. 리턴타입이 같아야 한다. 2.메소드 이름이 같아야 한다. 3.시그니처가 같아야 한다.
//		4. 접근 제어자는 부모클래스의 접근제어자와 같거나 넓어야 한다.
//		부모의 메소드는 삭제되지 않고, 덮어씌워져 있다.
//	@override : @ <==어노테이션, 자식클래스에서 메소드 오버라이딩을 할때 오류를 방지하는 기능


class A {
	void print() {
		System.out.println("A 클래스 출력");
	}
}
class B extends A {
	
	@Override		//메소드 오버라이딩 오류를 방지하는 설정
	void print() {		//오버라이딩 된 메소드 : 
		System.out.println("B 클래스 출력");
	}
}



public class Using_Method_Overriding {

	public static void main(String[] args) {
		//1. A 객체 생성, A 타입으로 지정
		A aa1=new A();
		aa1.print();	//A클래스 출력
		
		//2. B 객체 생성, B 타입으로 지정
		B bb1=new B();
		bb1.print();
		
		//2. B 객체 생성, A 타입으로 지정
		A aa2=new B();
		aa2.print();		//B클래스 출력(오버라이딩된 메소드가 출력됨)
		
		
	}

}
