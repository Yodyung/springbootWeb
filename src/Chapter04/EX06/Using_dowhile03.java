package Chapter04.EX06;

import java.util.Scanner;

public class Using_dowhile03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean run= true;
		int nu=0;		//스캐너에서 정수를 인풋
		
		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("원하는 숫자를 선택 하세요 >>>");
			nu=sc.nextInt();
			 
			/*
			 1.
			 	System.out.println("==1. 19단 출력==");
				for(int gu=1; gu<20; gu++) {
					for(int g=1; g<20; g++) {
						System.out.print(gu+"*"+g+"="+gu*g+"\t");
					}System.out.println();
				}
			
			 2.
			 
				System.out.println("==2. 홀수단 출력==");
				for(int gu=1; gu<20; gu++) {
					for(int g=1; g<20; g++) {
						if(gu%2!=0) {
							System.out.print(gu+"*"+g+"="+gu*g);
							System.out.print("\t");
						}
						if(gu%2==0) {System.out.println();}
					}
				}
			 
			 3.
			 	System.out.println("==3. 3의 배수단 출력==");
				for(int gu=1; gu<20; gu++) {
					for(int g=1; g<20; g++) {
						if(gu%3==0) {
							System.out.print(gu+"*"+g+"="+gu*g+"\t");
						}	
					}if(i%3==0) {System.out.println();}
				}
			 
			 4.
			
			 */
			
			
			
			if(nu==1) {
				//1. 19단 출력 if for for
				System.out.println("==1. 19단 출력==");
				for(int gu=1; gu<20; gu++) {
					for(int g=1; g<20; g++) {
						System.out.print(gu+"*"+g+"="+gu*g+"\t");
					}System.out.println();
				}System.out.println();
			}else if(nu==2) {
				int gu=0;
				int g=0;
				
				System.out.println("==2. 홀수단 출력==");
				for(gu=1; gu<20; gu++) {
					for(g=1; g<20; g++) {
						if(gu%2==1) {
							System.out.print(gu+"*"+g+"="+gu*g);
							System.out.print("\t");
						}
					}
					if(gu%2==1) {
						System.out.println();
					}
				}
				
			}else if(nu==3) {
				System.out.println("==3. 3의 배수단 출력==");
				for(int gu=1; gu<20; gu++) {
					for(int g=1; g<20; g++) {
						if(gu%3==0) {
							System.out.print(gu+"*"+g+"="+gu*g+"\t");
						}
						}if(gu%3==0) {
							System.out.println();
					}
				}
				
			}else if(nu==4) {
				System.out.println("==4. 종료==");
				break;
			}else {
				System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
			}
			
			
			
			
		}while(run);	//무한루프
		System.out.println("프로그램 종료");
		sc.close();
	}

	
}
