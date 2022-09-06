package Chapter04.EX04;

import java.util.Scanner;

public class Using_for03 {

	public static void main(String[] args) {
		//for문 내에 if문
		// 정수 (음수, 양수)를 스캐너로 5개 인풋 받아서 양수만 더한 값, 평균값을 출력하세요.
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("정수를 입력하시오.");
		
		double sum=0;
		double count=0;
		
		for(int a=0; a<5; a++) {
			int b=sc.nextInt();
			if(b>0) {
				sum+=b;
				count +=1;
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);
		
		/*
		 선생님 답지
		 
		 int sum=0;		양수만 더함
		 int sum1=0;	모든수를 더함
		 int count=0;	양수를 카운트 하는 변수
		 int count1=0;	모든 수를 카운트함
		 
		 
		 for(int i=0; i<5; i++) {
		 	int n=sc.nextInt();
		 	sum1+=n;		입력 받은 모든 수를 더함
		 	count1++;		모든 수를 카운트
		 	if(n>0) {
		 		sum+=n;		
		 		count++;	양수일때 1씩 증가
		 	}
		 }
		System.out.println("양수의 합 : "+sum+" 양수의 평균 : "+sum/(double)count);
		System.out.println("모든 수의 합 : "+sum1+" 모든 수의 평균 : "+sum1/(double)count1); 		
		 */
		
	
		
		sc.close();
	
		
		
		
		
		
		
		
	}

}
