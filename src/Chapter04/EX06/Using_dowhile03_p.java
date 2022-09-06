package Chapter04.EX06;

import java.util.Scanner;

public class Using_dowhile03_p {

	public static void main(String[] args) {
		/*
		 System.out.println("-------------------------------------------------------");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("원하는 숫자를 선택 하세요 >>>");
			스캐너에서 정수를 인풋
		 */
		Scanner sc=new Scanner(System.in);
		
		boolean run=true;
		int put=0;
		
		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("원하시는 번호를 선택하세요.>>>");
			System.out.println("-------------------------------------------------------");
			System.out.println("1.9단 출력|2.홀수단 출력|3.3의 배수단 출력|4.종료");
			
			put=sc.nextInt();
			
			int gu=0;
			if(put==1) {
				for(gu=1; gu<10; gu++) {
					for(int g=1; g<10; g++) {
						System.out.print(gu+"*"+g+"="+gu*g+"\t");
					}if(gu<10) {
						System.out.println();
					}
				}
				
			}else if(put==2) {
				for(gu=1; gu<10; gu++) {
					for(int g=1; g<10; g++) {
						if(gu%2!=0) {
							System.out.print(gu+"*"+g+"="+gu*g+"\t");
						}
					}if(gu%2!=0) {
						System.out.println();
					}
				}
				
			}else if(put==3) {
				for(gu=1; gu<10; gu++) {
					for(int g=1; g<10; g++) {
						if(gu%3==0) {
							System.out.print(gu+"*"+g+"="+gu*g+"\t");
						}
					}if(gu%3==0) {
						System.out.println();
					}
				}
				
			}else if(put==4) {	
				break;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
		while(run);
		System.out.println("시스템을 종료합니다.");
		
		sc.close();
	}

}
