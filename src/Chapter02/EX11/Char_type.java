package Chapter02.EX11;

public class Char_type {

	public static void main(String[] args) {
		//char 데이터 타입 : 하나의 문자만 저장,
		//-문자, 숫자, 유니코드로 저장할 수 있다.
		//-''를 사용해서 저장한다.
		//-2개의 문자 이상은 String을 사용한다.
		
		//유니코드(2byte) : 전 세계 모든 문자를 16진수로 표기 
		
		

		//1. 문자로 저장하는 방법 : ''
		char value1 = 'A';	//문자를 2개 이상 넣을 시 오류
		char value2 = '가';
		char value3 = '3';	//숫자 3이 아닌 문자 3
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("===============");
		
		//2. 정수로 저장하는 방법
		char value4 =65;		// A <= 65 숫자로 영어 문자 표현하기
		char value5 =0xac00;	//0x는 16진수를 뜻한다. 가 <= 0xac00 16진수로 한글 문자 표현하기
		char value6 = 51;		// 3 <=51 숫자로 숫자 표현하기
		
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("===============");
		
		//3. 유니코드 형식으로 저장(\ '\'u +유니코드) : ''를 사용해서 넣는다.
		
		char value7 = '\u0041';		//A
		char value8 = '\uac00';		//가
		char value9 = '\uac33';		//3
		
		
		char value100 = 35;			//# <= 35
		
		System.out.println(value7);
		System.out.println(value100);
		
		char value101 = '\uac11';  //갑
		System.out.println(value101);
		
		//구글 검색을 사용해서 자신의 이름의 유니코드를 찾아서 char에 저장해서 출력
		
		char a ='\uc608';
		char b = '\uc0ac';
		char c = '\ub791';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("================");
		System.out.printf("%s%s%s",a,b,c);
		System.out.println();
		System.out.println("================");
		
		char dd = '예';
		char ee = '사';
		char ff = '랑';
		
		//printf = 자동줄바꿈 안돼서 ""안에 \n넣어주면 줄바꿈 됨
		
		System.out.printf("%s%s%s\n",dd,ee,ff);
		
		
		//문자 A를 저장하는 다양한 방법
		char aa = 'A';	// A <== 65
		char bb = 65;	// 정수로 저장 (10진수)  프로그램에서는 10진수보다 16진수를 많이 사용
		char cc = 0b1000001;	//0b <== 2진수 표현, 뒤에 오는 값이 2진수이다.
		char d = 00101; 		//00 <== 8진수 표현, 뒤에 오는 값이 8진수
		char e = 0x0041;		//0x <== 16진수 표현, 뒤에 오는 값이 16진수
		char f = '\u0041';		//유니코드로 값 할당
		
		
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
