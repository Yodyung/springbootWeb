package Chapter04.EX04;

import java.util.Scanner;

public class Using_for05 {

	public static void main(String[] args) {
		// for 이중문 구구단 만들기
		
		
		for(int gu=1; gu<10; gu++) {
			for(int dan=1; dan<10; dan++) {
			System.out.print(gu+"X"+dan+"="+gu*dan+"\t");	
			}System.out.println();
		}

		System.out.println("--------------------------------------------------------------------");
		
		//1단 ~ 19단까지 3의 배수단만 출력
		
		for(int gu=1; gu<=19; gu++) {
			for(int dan=1; dan<=19; dan++) {
				if(gu%3==0) {
					System.out.print(gu+"*"+dan+"="+gu*dan);
					System.out.print("\t");
				}
				
			}if(gu%3==0) {
				System.out.println();
			}	
		}
		System.out.println("--------------------------------------------------------------------");
		
		/* 스캐너에서 입력 받은 단만 출력(1~9단)
		 	출력할 단을 입력하세요(1~9단) >>>
		 	==========================
		 	1*1=1
		 	1*2=2
		 	.....
		 	1*9=9
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("출력할 단을 입력하세요(1~9단) >>>");
		System.out.println("==========================");
		
		int nu=sc.nextInt();
		
		for(int gu=1; gu<10; gu++) {
			for(int g=1; g<10; g++) {
				if(nu==gu) {
					System.out.println(nu+"*"+g+"="+nu*g);
				}	
			}
		}
		sc.close();
		
		
		
		
		
		
	}

}
