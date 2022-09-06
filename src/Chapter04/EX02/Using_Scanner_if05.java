package Chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		 * 스캐너로 나이를 인풋 받아서 출력
		 
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
		System.out.println("------------------------");
		
		int age=sc.nextInt();
		int p=0;
		
		if(age>=20) {
			p=4000;
			System.out.printf("일반인입니다. 입장료는 %d원 입니다.",p);
		}else if(age>=14) {
			p=2500;
			System.out.printf("중,고등학생입니다. 입장료는 %d원 입니다.",p);
		}else if(age>=8) {
			p=2000;
			System.out.printf("초등학생입니다. 입장료는 %d원 입니다.",p);
		}else {
			p=1000;
			System.out.printf("미취학 아동입니다. 입장료는 %d원 입니다.",p);
		}
		
		//System.out.println("입장료는"+price+"원 입니다.");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
