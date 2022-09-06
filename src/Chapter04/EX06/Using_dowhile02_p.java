package Chapter04.EX06;

import java.util.Scanner;

public class Using_dowhile02_p {

	public static void main(String[] args) {
		//스캐너로 인풋 받는 변수	
		Scanner sc=new Scanner(System.in);

		boolean run= true;	// ===> 변수 선언과 불리언 선언 미리 해놓고 
		int want=0;
		do {				// ==> do 군락 만들어서 밑에 입력하기
		System.out.println("-------------------------------------");
		System.out.println("1.문자열 출력|2.정수 출력|3.종료");
		System.out.println("원하시는 번호를 입력하세요 >>>");
		System.out.println("-------------------------------------");
		
		int wan=sc.nextInt();
		 
		if(wan==1) {
			System.out.println("문자열을 출력합니다.");
			System.out.println();
			
		}else if(wan==2) {
			System.out.println("정수를 출력합니다.");
			System.out.println();
			
		}else if(wan==3) {
			break;
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		}
		
		}while(run);
		System.out.println("시스템을 종료합니다.");

		sc.close();
		
	}

}
