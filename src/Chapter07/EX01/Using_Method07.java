package Chapter07.EX01;

public class Using_Method07 {
	
	static void print() {
		System.out.println("입력된 데이터가 없습니다. - 매개변수 없음");
	}
	
	//다시정리해야함
	
	//static void print(int a) {
	//	System.out.println(a+" : 값이 입력되었습니다. 매개 변수 : 정수1");
	//}
	//static void print(int c) {
	//	System.out.println(c+" : 값이 입력되었습니다. 매개 변수 : 정수1");
	//}
	//매개변수의 타입과 갯수가 같아서 오류발생. 시그니처가 같다. : 메소드 명, 매개변수의 타입,갯수
	
	static void print(double a) {
		System.out.println(a+" : 값이 입력되었습니다. 매개 변수 : 실수1");
	}
	
	static void print(double a, double b) {
		System.out.println(a+","+b+" : 값이 입력되었습니다. 매개 변수 : 실수 1. 실수 1");
	}
	
	static void print(int a, int b) {
		System.out.println(a+","+b+" : 값이 입력되었습니다. 매개 변수 : 정수 1. 정수 1");
	}
	
	static void print(int a, double b) {
		System.out.println(a+","+b+" : 값이 입력되었습니다. 매개 변수 : 정수 1. 실수 1");
	}
	
	
	// static int print (int c, doudble d) { 
	//	System.out.println("시그니처가 중복됨");
	//	};
	
	/*
	 * 
	 */
	

	public static void main(String[] args) {
		// 메소드 오버로딩(Method overloading) : 
		//		- 동일한 메소드 이름에 대해서 시그니쳐가 다른 경우 다른 메소드로 인식한다.
		//		- 시그니처(식별자): 입력 매개변수 타입, 입력 매개변수 개수
		//		-리턴타입은 시그니처가 아니다.
		
		// 메소드 오버 라이딩(Method overriding) : 상속
		//		- 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의해서 사용하는 것.
		
		//매개변수 없는 메소드 호출 : print()
		print();
		System.out.println("--------------------------------");
		//pring(정수)	
		print(10);
		
		
		
		
		
	}

}
