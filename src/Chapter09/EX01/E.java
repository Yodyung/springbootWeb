package Chapter09.EX01;

//E class는 A class를 상속 받는다. <== A 클래스의 모든 필드, 메소드를 물려 받는다.
//A class : 부모 클래스(super class)
//E class : 자식 클래스(child class)
// 동일한 패키지에서 상속 설정이 됨.

public class E extends A {

	public void print() {
		System.out.println("------부모의 필드 출력-------");
		System.out.println(a);	//접근 제어자가 public		<== 부모의 a 필드
		System.out.println(b); 	//접근 제어자가 protected	<== 부모의 b 필드
		System.out.println(c); 	//접근 제어자가 default	<== 부모의 c 필드
//		System.out.println(d); 	//접근 제어자가 private	<== 부모의 d 필드		동일한 파일에서만 접근, 접근 불가
	
		System.out.println("------부모의 메소드 호출-------");
		print();		//부모의 메소드 호출 public
		print1();		//부모의 메소드 호출 protected
//		print2();		//부모의 메소드 호출 private		접근 불가
		print3();		//부모의 메소드 호출 default
		
	
	}
}
