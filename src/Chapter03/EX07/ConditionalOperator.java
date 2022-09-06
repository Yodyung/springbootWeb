package Chapter03.EX07;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 <== 자주 사용
		// (조건) ? 참 : 거짓 ;
		// 조건이 참이면 '참'을 실행, 조건이 거짓이면 '거짓'을 실행
		// : ==> 깃발을 나타낸다.
		
		int value1=(3>5)?6:9;	//false이기 때문에 변수가 9
		int value2=(3<5)?6:9;	//true이기 때문에 변수가 6
		
		System.out.println(value1); 	//조건이 false이므로 변수에 9가 할당.
		
		int value3 = (5>3) ? 10:20;	//true이기 때문에 변수가 10
		System.out.println(value3);
		
		int value4 =14;
		System.out.println((value4%2==0)?"짝수":"홀수");	//2로 나누었을때 나오는 나머지값
		// % : 나머지 값만 출력.
		
		//5의 배수만 인지 삼항 연산자를 통해서 확인
		
		int value5=3740;
		
		System.out.println((value5%5==0)? "5의배수이다":"5의배수가아니다");
	
		//나이가 20 이상이면 당신은 성인이다. 성인이 아니다.
		
		int value6 = 20;
		System.out.println((value6>=20)?"당신은 성인이다":"당신은 성인이 아니다");
		
		//3항 연산자는 if ~ else 문으로 변환 가능
		/*
		if(조건)  {
		  실행문1;	<= 조건이 참이면 실행문 1이 실행
		  
		  } else{
		  실행문2;	<= 조건이 거짓일 때 실행문 2가 실행
		  
		  }
		*/
		
		System.out.println("===============");
		
		value4=5;
		
		if (value4%2==0) {
		//조건이 참일때 실행하는 블락
		System.out.println("짝수");
	}else {
		//조건이 거짓일때 실행하는 블락
		System.out.println("홀수");
	}
		System.out.println("===============");
	//5의 배수를 출력	
		value5=34;
		
		if(value5%5==0) {
			System.out.println("5의 배수이다.");

		}else {
			System.out.println("5의 배수가 아니다.");
		}
		
	System.out.println("===============");
		//나이가 20살 이상이면 성인
		value6=15;
		
		if(value6>=20) {
			System.out.println("당신은 성인이다.");

		}else {
			System.out.println("당신은 성인이 아니다.");
		}
		
	

		
		
		
		
		
		
		
		
		
	}
}
