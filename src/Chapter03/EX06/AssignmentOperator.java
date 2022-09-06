package Chapter03.EX06;

public class AssignmentOperator {

	public static void main(String[] args) {
		//대입 연산자의 축약 표현
		/*
		 산술 연산의 축약 표현
		 
		 a=a+b		a+=b	>이 표현 굉장히 많이 씀
		 a=a-b		a=+b
		 a=a*b		a*=b
		 a/b=b		a/=b
		 
		 
		 비트 연산의 축약 표현
		 a=a&b		a=&b
		 a=a|b		a|=b
		 
		 
		 쉬프트 연산의 축약 표현
		 a=a>>b		a>>=b
		 a=a<<B		a<<=b
		  
		  논리 쉬프트
		  
		a=a>>>b		a>>>=b
		
			 * 
			 * 
			 * 
			 */
		int value1 = 3;
		value1 =value1+3;		//대입 연산자는 제일 나중에 적용한다.
		System.out.println("============");
		System.out.println(value1);
		
		int value2;		//변수 선언
		value2=1;		//변수에 값 할당 : 
		System.out.println(value2+=2);	//value2 = value2+2
		System.out.println(value2-=2);	//value2 = value2-2
		System.out.println(value2*=2);	//value2 = value2*2
		System.out.println(value2/=2);	//value2 = value2/2
										// 2
		System.out.println(value2%=2);	//value2 = value2/2 
										//나머지 값만 출력
		System.out.println(value2<<=2);	//2 value1=valure
		
		System.out.println(value2 >>=2); //value2 =value2
		
			// 1*2^2
		
		
		
		

	}

}
