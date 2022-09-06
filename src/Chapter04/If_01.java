package Chapter04;

public class If_01 {

	public static void main(String[] args) {
		/*
		 제어문 : 프로그램의 순서를 바꾸는 구문
		 	-선택 제어문 : if, switch
		 	-반복 제어문 : for, while, do while
		 	
		 	if : 조건을 만족하는 실행문을 실행 후 if문을 빠져나온다. break가 따로 사용하지 않음.
		 		 switch 문은 break를 사용해서 구문을 빠져나온다.
		 	
			-if (조건) {실행문1;}; > 조건이 참일때만 실행문1이 실행된다.
			-if (조건) {
				실행문1; > 조건이 참일때
			}else{
				실행문2; > 조건이 거짓일때
			}
			
			-if(조건){		>조건1이 참일때, 실행문 1을 실행
				실행문1; 
			} else if(조건2){		>조건2가 참일때, 실행문 2를 실행
				실행문2;
			} else if(조건3){		>조건3가 참일때, 실행문 3을 실행
				실행문3;
			 ..... <무한대로 올 수 있음
			}else{
				실행문10;(조건10)	>위의 모든 조건을 만족하지 않을때 실행문 10을 실행
			}
			
		 */
		
		//if (조건) {실행문1}
		System.out.println("-------조건이 false--------");
		if (3>5) {			//조건이 false이므로 실행문 내의 구문은 실행되지 않는다.
			System.out.println("Hello");
			System.out.println("YUP");
		} // ==> if 구문 시작과 }를 동일 선상에 맞춰서 정렬해주어야 함. 개발을 혼자하는게 아니기 때문에! 
		
		System.out.println("-------조건이 true--------");
		
		if (12>5) {			//조건이 true이므로 실행문 내의 구문은 실행된다.
			System.out.println("Hello");
			System.out.println("YUP");
		}
		
		//if 조건에서 실행문이 1개일때는 중괄호를 생략할 수 있다.
		// 권장사장 : 중괄화 명시 후 사용
		
		System.out.println("---------------");
		if (5<3)
			System.out.println("오늘은 비가 옵니다.");	// >중괄호 생략
			System.out.println("비가 보슬보슬 옵니다.");	// >중괄호 밖의 실행구문
			
			System.out.println("---------------");
			
		/* if (조건) {
				실행문 1 ;	//조건이 참일때, 실행문 1 실행
		   }else {
		   		실핼문 2 ;	//조건이 거짓일때, 실행문2 실행
		   }
			
			
			*/
		
			if (25>23) {	//조건은 반드시 true, false
				System.out.println("실행1(참)");	//조건이 참일 때 실행
			}else {
				System.out.println("실행2(거짓)");	//조건이 거짓일 때 실행
			}
		
			//변수 선언 : 동일한 변수를 여러개 선언 시킬때 ,로 구분.
			//기본 자료형 (8가지) : 초기값을 할당하지 않으면 오류
					//boolean, byte, short, int, long, float, double, char
			
			//참조 자료형 (무한대) : 초기값을 활당하지 않으면 컴파일러가 자동으로 넣어줌
			// String (문자열) <==참조 자료형
			
			int a,b;	//변수 선언만 한 경우
			//System.out.println(a);	//변수의 값을 알려주지 않고 출력
			a=5; b=0; //변수 초기값 할당
		
			if (a>5) {
				b=10;
			}else {
				
				b=20;
			}
			System.out.println(b);	//20
	
			//if (조건) ~else 구문을 삼항 연산자로 변환 : 삼항 연산자는 한 라인으로 처리
			
			System.out.println("-------삼항연산자 출력--------");
			System.out.println((a>5)?10:20);
			
			/*3. 조건이 여러개인 경우 : if (조건) ~else if(조건)~ else 구문
			 		- 해당 조건을 만족하는 실행문을 실행 후 if문 탈출
			 */
			
			System.out.println("---------------");
			int c;
			c=85;
			
			if(c>=90) {									//false
				System.out.println("A학점입니다.");
			}else if(c>=80) {							//true
				System.out.println("B학점입니다.");			//실행문 실행 후 if문을 빠져 나옴
			}else if(c>=70) {							//이미 위에서 빠져 나갔기 때문에 실행하지 않음
				System.out.println("C학점입니다.");
			}else if(c>=60) {
				System.out.println("D학점입니다.");
			}else {
				System.out.println("학점 미달입니다.");
			}
			
			System.out.println("if문 탈출됨");
			
			
			
			
	}
}
