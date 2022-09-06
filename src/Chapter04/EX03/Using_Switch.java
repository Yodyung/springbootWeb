package Chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		//switch 문 - 반드시 break; 를 사용해서 해당 case를 탈출
		
		//switch 구문에서 break;를 사용하지 않는 경우
		//해당 case로 점프후에 하위의 모든 case를 실행
		//break; 해당 실행문을 빠져나온다.
		//아주 많은 데이터들을 처리할 때는 switch가 if문보다 처리속도가 빠르다.(과부하가 걸릴 수 있음)
		
		int a = 7;
		
		switch(a) {	//(위치변수): 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력"+a);
		case 2:
			System.out.println("변수 값을 출력"+a);
			
		case 3:
			System.out.println("변수 값을 출력"+a);
		case 4:
			System.out.println("변수 값을 출력"+a);
		default:	//if 문의 else와 같이 case의 값이 없는 모든 경우
			System.out.println("변수 값을 출력"+a);
		}

		/*
		 switch문에서 break; 사용, <== 일반적으로 사용
		  
		*/ 
		a = 4;
		
		switch(a) {	//(위치변수): 정수, 문자, 문자열
		case 1:
			System.out.println("case 1을 출력"+a);
			break;
		case 2:
			System.out.println("case 2값을 출력"+a);
			break;
		case 3:
			System.out.println("case 3값을 출력"+a);
			break;
		case 4:
			System.out.println("case 4을 출력"+a);
			break;
		default:	//if 문의 else와 같이 case의 값이 없는 모든 경우
			System.out.println("default 출력"+a);	//default에서는 break
		}		//default에서 break는 일반적으로 생략
		
		System.out.println("-------------------------------");
		
		//7점 이상인 경우 pass, 그렇지 않은 경우 fail
		
		int b=0;
		
		switch(b) {
		case 10:
			System.out.println("pass");
			break;
		case 9:
			System.out.println("pass");
			break;
		case 8:
			System.out.println("pass");
			break;
		case 7:
			System.out.println("Fail");
			break;
		case 6:
			System.out.println("Fail");
			break;
		default:
			System.out.println("fail");
		}
	
		System.out.println("---------------------------");
		//축약표현
		b=8;
		switch (b) {
		case 10: case 9: case 8: case 7:
		System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		//switch문 <=======>if~ else if문과 상호 변환됨	
		
		System.out.println("---------------------------");
		int c=4;
		
		switch (c) {
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("D학점");
			
		}
		
		//위 구문을 if else 구문으로 변환
		
		System.out.println("---------------------------");
		c=7;
		
		if (c>9) {
			System.out.println("A학점");
		}else if(c==8) {
			System.out.println("B학점");
		}else if(c==7) {
			System.out.println("C학점");	//실행 후 if문을 빠져나온다. (break 사용할 필요 없음)
		}else {
			System.out.println("D학점");
		}
		
		
		
		
		
		
		
		
		
	}

}
