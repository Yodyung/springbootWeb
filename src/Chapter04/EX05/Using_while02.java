package Chapter04.EX05;

import java.util.Scanner;

public class Using_while02 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 -1이 될 때까지 정수값을 넣어서 평균
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;	//정수가 몇개 입력되는지 카운트함. <평균을 낼 때>
		int sum=0;		//입력 받는 정수를 모두 더한 값 
		
		System.out.println("원하는 정수를 입력하세요. 마지막에 -1로 종료를 알리세요.");
		int n=sc.nextInt();		//콘솔에서 정수값을 입력 받아 n 변수에 할당.
		
		
		//루프를 돌릴 반복 횟수를 알 수 없는 경우 : while
		while(n!=-1) {	// 입력받은 정수값이 -1이 아니면 while문을 실행
			sum+=n;		//sum = sum+n;
			count++;	//정수 값을 counting함
			n=sc.nextInt();		//-1이 정수 값으로 input되면 loop를 빠져나옴
			
		}
		if (count==0) {		//제일 처음에 정수값을 -1
			System.out.println("입력된 정수가 없습니다.");
		}else {		//정수 값을 하나 이상 넣은 경우 
			System.out.println("입력된 정수는 : "+count+"개 입니다.");
			System.out.println("정수의 합계는 : "+sum+" 입니다.");
			System.out.println("정수의 평균은 : "+sum/(double)count+" 입니다.");
		}
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
