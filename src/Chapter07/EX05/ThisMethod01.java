package Chapter07.EX05;

class ABC{
	
	//생성자(기본) : 인풋 매개변수가 없는 생성자
	ABC() {	
		System.out.println("첫번째 생성자 - 기본 생성자");
	}
	ABC(int a) {
		this();	//기본 생성자를 호출, this() - 인풋이 없는 생성자 호출
		System.out.println("두번째 생성자 호출");
	}
	ABC(int a, String b) {
		this(30); 	//매개변수가 정수 1개인 생성자 호출
		System.out.println("세번째 생성자 호출");
	}
	ABC(int a, String b, String c) {
		this(30,"안녕"); 	//매개변수가 정수 2개인 생성자 호출
		System.out.println("네번째 생성자 호출");
	}
}



public class ThisMethod01 {

	public static void main(String[] args) {
		// ThisMethod : 자신 클래스의 다른 생성자를 호출
		// 반드시 생성자 내부에서 사용됨. 메소드 내부에서는 사용할 수 없음.
		// 반드시 생성자 첫번째 라인에 위치해야 한다.
		
		System.out.println("============================================");
		ABC abc1 = new ABC();	//기본 생성자 호출
		
		System.out.println("============================================");
		ABC abc2 = new ABC(50);	//매개변수가 1개인 생성자 호출
		
		System.out.println("============================================");
		ABC abc3 = new ABC(20,"오늘");	//매개변수가 2개인 생성자 호출
		
		System.out.println("============================================");
		ABC abc4 = new ABC(20,"오늘","싫어");	//매개변수가 3개인 생성자 호출
	}

}
