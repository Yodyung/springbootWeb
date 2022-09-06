package Chapter04.EX02_prac;

import java.util.Scanner;

public class Using_Scanner_if06 {

	public static void main(String[] args) {
		/* 스캐너로 나이를 인풋 받아서 출력
		 
		 나이(age)가 8세 미만이면 : "취학 전 아동입니다"
		 						"입장료는 <1000>원 입니다."
		 나이(age)가 14세 미만이면 : "초등학생입니다"
		 						"입장료는 <2000>원 입니다."
		 나이(age)가 20세 미만이면 : "중, 고등학생입니다."
		 						"입장료는 <2500>원 입니다."
		 나이(age)가 20세 이상이면 : "일반인 입니다."
		  						"입장료는 <4000>원 입니다."
		*/
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("나이를 입력해주세요.");
		
		int a=sc.nextInt();
		int w=0;
		
		if(a<8) {
			System.out.println("취학 전 아동입니다.");
			w=1000;
		}else if(a<14) {
			System.out.println("초등학생입니다.");
			w=2000;
		}else if(a<20) {
			System.out.println("중,고등학생입니다.");
			w=2500;
		}else {
			System.out.println("성인입니다.");
			w=4000;
		}
		
		System.out.printf("가격은 %d원 입니다.",w);
		
		
		
		
		
	}

}
