package Chapter05.EX03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		//MainMethod의 입력 매개변수 전달하기, 메소드(객체 지향 언어) = 함수
		//	-메소드(함수)의 형식 : 리턴타입 메소드명 (입력매개변수) {실행부}
		//					   void main (String[] args) {실행부}
		
		//메인 메소드의 입력 매개 변수 args[i]번째 값을 받아서 각 변수에 할당.
		
		//안녕하세요 7 8.8 		<== String[] args
		
		String a = args[0];		//안녕하세요 args[0]
		String b = args[1];		//7 args[1]
		String c = args[2];		//8.8 args[2]
		
		//출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------------------------");
		
		//연산 (String) : + (연결연산자)
		System.out.println(b+1);	// (String)+1(int) = 71 (String)
		System.out.println(c+1);	// 8.8(String)+1(int) = 8.81 (String)
		System.out.println("------------------------------");
		
		//숫자 형식으로 되어있는 String => 정수, 더블형으로 변환
					//Integer.parseInt(String 변수)
					//Double.parseDouble(String 변수)
		
		//연산 (형변환 후 연산)
		int d = Integer.parseInt(b);	//b <== 문자형 3을 정수형으로 변경
		double e = Double.parseDouble(c);	//c <==문자형을 실수형으로 변경
		
		System.out.println(d);	//정수 7
		System.out.println(e);	//실수 8.8
		System.out.println("==============형 변환 후 연산=============");
		
		System.out.println(d+1);		//정수+정수
		System.out.println(e+1);		//실수+정수
		
		

	}

}
