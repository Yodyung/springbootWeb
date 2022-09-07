package Chapter06.EX01;

public class Student_Test {

	public static void main(String[] args) {
		// * 객체는 항상 main method에서 생성해야함!! *
		
		//같은 패키지 내부의 클래스는 import 없이 바로 호출이 가능
		
		//생성자 : 객체를 생성 시 필드의 초기값을 할당할 때 사용.
		
		Student lee = new Student(80, 99, 70, "lee");
		lee.call();

		Student hong = new Student(88,99,77,"hong");
		hong.call();
		
		Student ye = new Student(88,99,68,"ye");
		ye.call();
		
		Student jung = new Student();
		jung.call();
		
	}

}
