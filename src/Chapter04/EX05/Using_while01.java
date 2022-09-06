package Chapter04.EX05;

public class Using_while01 {

	public static void main(String[] args) {
		// while (조건) {
		//	실행문 ;
		// }
		
		//while 반복 횟수를 알 수 없는 경우 사용.
		//for 반복 횟수를 알 수 있는 경우 사용.
		
		// - 초기값 선언을 반드시 while 밖에서 선언해야함. <while문 내에서 선언시 무한루프>
		// - 증가값은 while 내에서 선언을 함. <증가값을 선언하지 않으면 무한루프>
		
		
		// 1. while문에서 반복 횟수가 0 인 경우
		System.out.println("================반복횟수0===================");
		int a=0;	//변수 초기 값은 while 밖에서 선언
		while(a<0) {					 //false이기 때문에 실행되지 않음
			System.out.printf(a+" ");	 //조건이 true 일때만 실행
		}
		
		// 2. while문에서 반복 횟수가 1 인 경우
		System.out.println("================반복횟수1, break사용===================");
		a=0;
		while(a==0) {
			System.out.printf(a+" \n");
			break;
		}
		
		// 2-1. while문에서 반복 횟수가 1 인 경우
		System.out.println("================반복횟수1, 증가값을 사용===================");
		a=0;
		while(a==0) {
			System.out.printf(a+" ");
			a++;
		}
		
		// 2-2. while문에서 반복 횟수가 1 인 경우
		System.out.println(); 		//enter
		System.out.println("================반복횟수10===================");
		a=0;				//초기값 꼭 while 밖에서 선언
		while(a<10) {
			System.out.print(a+" ");
			a++;					//증가값은 while 내에서 처리
		}
		
		System.out.println();
		System.out.println("============초기값을 while문 내에 넣는 경우 : 무한루프 발생===============");
	
		
		while(a<10) {
			a=0;					//초기화 값을 while문 내에서 선언하면 무한루프
			System.out.print(a+" ");
			a++;					//증가값은 while 내에서 처리
		}
		
		//while문은 조건을 생략 할 수 없다.
		//for문은 조건을 생략 시 무한루프
		//while문에서 무한루프를 돌릴때 조건에 true 
		
		System.out.println();
		System.out.println("=======================================");
		
		a=0;
		boolean b;
		b=true;
		
		while(b) {
			System.out.print(a+" ");
			a++;
			if(200<a) {
				break;
			}
		}
		
		
		
		
	}

}
