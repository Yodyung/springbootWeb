package Chapter04.EX04;

import java.util.Scanner;

public class Using_for03_p {

	public static void main(String[] args) {
		// 정수 (음수, 양수)를 스캐너로 5개 인풋 받아서 양수만 더한 값, 평균값을 출력하세요.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요. 총 5번 입력가능합니다.");
	
		int sum=0;
		int count=0;
		int sum2=0;
		int count2=0;
		
		for(int a=0; a<5; a++) {
			double total=sc.nextDouble();	//항상 입력값을 위에다 두고 밑에다가 함수 적용하기!!
			sum2+=total;
			count2++;
			if(total>0) {
				sum+=total;
				count++;
			}
			

		}
		System.out.println("양수만 더한 값 : "+sum+" 양수의 평균 값 :"+sum/(double)count);
		System.out.println("모든 수 더한 값 : "+sum2+" 양수의 평균 값 :"+sum2/(double)count2);
		
		
		
		
		sc.close();
	}


}
