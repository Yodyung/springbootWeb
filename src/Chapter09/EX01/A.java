package Chapter09.EX01;

// 클래스의 접근 지정자 : public, default(생략)
// 필드, 생성자, 메소드 : public, protected, private, default(생략)
//	public : 다른 패키지, 같은 패키지 모두 접근 가능
//	protected : 다른 패키지(상속 적용이 되어 있어야함), 같은 패키지 모두 접근 가능
//	private : 다른 패키지, 같은 패키지 모두 접근 불가능 같은 파일 안에서만 접근 가능
//	default : 다른 패키지 접근 불가능, 같은 패키지 접근 가능


public class A {
	public int a=10;		//다른 패키지, 같은 패키지
	protected int b=20;		//다른 패키지(상속), 같은 패키지
	int c=30;				//같은 패키지
	private int d=40;		//같은 파일(패키지X)
	
	//메소드의 접근 제어자
	public void print() {
		System.out.println("A 클래스 출력 - public");
	}
	
	protected void print1() {
		System.out.println("A 클래스 출력 -protected");
	}
	
	private void print2() {
		System.out.println("A 클래스 출력 -private");
	}
	
	void print3() {
		System.out.println("A 클래스 출력 -default");
	}

}