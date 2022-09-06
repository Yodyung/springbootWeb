package Chapter04.EX02;

import java.util.Scanner;

//같은 패키지 외부의 객체를 사용할 경우 import가 필요함.

public class Using_Scanner {

	public static void main(String[] args) {
		// Scanner : 첫글자가 대문자로 시작 : 클래스 (객체를 생성하는 틀)
		/*
		 -콘솔(밑의 console화면)을 통해서 값(정수-int, 문자열-next(),nextln(), 실수, 문자 등)을 받아서 처리
		 -객체를 임포트 해서 사용해야 한다. (import java.util.Scanner)
		 -공백이나 엔터를 사용해서 여러개의 값을 넣을 수 있다.
		 -Scanner sc를 사용한 후에는 sc.close()를 사용해서 객체를 메모리에서 제거시켜주어야 함.
		 
		 */
		
		Scanner sc = new Scanner(System.in); // <== ★★중요함 외워놓기!!★★
				//Scanner 클래스로부터 sc라는 객체를 생성함. (sc : 콘솔을 통해서 인풋 받음)
				//ctrl + shift + o : 외부 클래스 자동 import
				//콘솔에 입력 시 공백을 넣어주면 한번에 변수값을 전부 입력할 수 있음.(서식이 맞을 시에)
		
		//sc는 객체
		//sc.nextint() : 객체의 메소드(함수)
		System.out.println("반드시 정수를 입력하세요>>>");
		
		int a = sc.nextInt();	//콘솔에서 정수값을 받아서 변수 a에 할당. 
		System.out.println("변수 a를 출력 : "+a);
		
		
		System.out.println("반드시 문자열을 입력하세요>>>");
		String b =sc.next();	//콘솔에서 문자열을 받아서 변수 b에 할당.
		System.out.println("변수 b를 출력 : "+b);
		
		System.out.println("반드시 실수값을 입력하세요>>>");
		double c =sc.nextDouble();
		System.out.println("변수 c를 출력 : "+c);
		
		//스캐너에서 char 문자열 처리
		//한 문자를 처리할 때, string 변수 선언 
		
		System.out.println("반드시 한 문자만 입력하세요>>>");
		String s=sc.next();	//문자열 변수 선언
		char d =s.charAt(0);	//0번째 값만 출력한다는 뜻		//문자열 +enter	
		System.out.println("변수 d를 출력 : "+d);
		
		sc.close(); //메모리에서 객체 삭제.
		
		
	}

}
