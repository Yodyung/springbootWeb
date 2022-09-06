package Chapter04.EX02_prac;

import java.util.Scanner;

public class Using_Scanner_if06_4 {

	public static void main(String[] args) {
		// 문제 : Scanner로 국어a, 영어b, 수학c, 과학d, 음악e, 미술f 점수를 정수값으로 인풋 받습니다. 
		//if문을 사용해서 평균이 90점 이상 "수", 80점 이상 "우", 70점 이상 "미", 60점 이상 "양" 
		//그렇지 않을 시 "가"
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("국/영/수/과/음/미 순으로 성적을 입력하십시오.");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		
		double ag=(a+b+c+d+e+f)/6.0;
		
		System.out.printf("당신의 성적은 ");
		
		if(ag>=90) {
			System.out.printf("수");
		}else if(ag>=80) {
			System.out.printf("우");
		}else if(ag>=70) {
			System.out.printf("미");
		}else if(ag>=60) {
			System.out.printf("양");
		}else {
			System.out.printf("가");
		}
		
		System.out.printf(", 당신의 평균점수는 %4.1f점 입니다.",ag);
	}

}
