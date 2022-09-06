package Chapter04.EX04;

public class Using_for01 {

	public static void main(String[] args) {
		/*
		 for (초기값; 조건; 증가값) {
		 		실행문1; 				<==조건이 참일동안 계속 반복, 조건이 거짓이면 for를 빠져나옴
		 
		 }
 		 
		 */
		
		
		
		
		
		//기본 for문
		int a;
		for(a=0; a<3; a++) {		//초기값; 조건; 증가값  < ;로 구분지어줘야함
			System.out.println(a);
			
		}	//0 1 2 

		System.out.println("-----------------------------");
		
		
		//초기값과 증가값에는 ,로 구분해서 여러개의 변수가 올 수 있다.
		
		int b,c,d;
		
		for(b=0,c=10,d=20; b<5; b++,c+=2,d-=3) {		
			//b=1씩증가 c=2씩증가 d=3씩감소
			System.out.println("b:"+b+"c:"+c+"d:"+d);
			
		}
		
		System.out.println("-----------------------------");
		
		//for문에서 무한루프 (조건이나 증가값을 잘못 처리할 경우) console 탭에서 중지를 누를 수 있음

		int e;
		for(e=0; e<7; e+=3) {
			System.out.println(e);		//조건이 true일 동안 반복
		}
		
		System.out.println("-------------for문 없이 : 1~10까지 덧셈----------------");
		//1부터 10까지 for문 없이 덧셈 
		
		int sum1;
		sum1=0;		//0
		sum1+=1;	// sum1=sum1+1		//1
		sum1+=2;	// sum1=sum1+2		//3
		sum1+=3;	// sum1=sum1+3		//6
		sum1+=4;	// sum1=sum1+4		//10
		sum1+=5;	// sum1=sum1+5		//15
		sum1+=6;	// sum1=sum1+6		//21
		sum1+=7;	// sum1=sum1+7		//28
		System.out.println(sum1);
		sum1+=8;	// sum1=sum1+8		//36
		sum1+=9;	// sum1=sum1+9		//45
		sum1+=10;	// sum1=sum1+10		//55
		System.out.println("1~10까지의 합 : "+sum1);
		
		System.out.println("-----------------------------");
		
		//for문을 사용해서 1부터 100까지의 합계
		
		int sum2;
		int i;
		
		for(i=1, sum2=0; i<=10; i++) {
			sum2+=i;
			System.out.println("sum2 : "+sum2+", i : "+i);
		}
		System.out.println("1부터 10까지의 합계 : "+sum2);
		
		//for문을 사용해서 0~1000까지 7의배수의 합계
		//7의 배수의 합계 : 
		
		System.out.println("-----------------------------");
		int sum3;
		int bae;
		
		for(bae=0, sum3=0; bae<=1000; bae+=7) {
			sum3+=bae;
			
		}
		System.out.println("7의 배수의 합계 : "+sum3);
		
		System.out.println("-----------------------------");
		
		//for문과 (for문 안에)if문을 사용해서 1~10까지 더한 값을 출력하되 아래와 같이 출력하세요.
		// 결과 : 1+2+3+4+5+6+7+8+9+10=55 print로
		
		int sum4;
		int io;
		
		for(io=1,sum4=0; io<=10; io++) {
			sum4+=io;
			if(io<10) {
				System.out.print(io+"+");
			}else {
				System.out.print(io+"="+sum4);
				System.out.println();
			}
		}
		
		System.out.println("-----------------------------");
		
		//for문과 (for문 안에)if문을 사용해서 11~55까지 더한 값을 출력하되 아래와 같이 출력하세요.
		// 결과 : 11+12...55= print로
		
		int sum5;
		int aa;
		
		for(aa=11, sum5=0; aa<=25; aa++) {
			sum5+=aa;
			if(aa<25) {
				System.out.print(aa+"+");
			}else {
				System.out.print(aa+"="+sum5);
			}
		}
		
		
		
		
		
		
		
	}

}
