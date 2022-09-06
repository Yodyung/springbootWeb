package Chapter04.EX04;

import java.util.Scanner;

public class Using_for05_p {
	public static void main(String[] args) {
		//1단 ~ 12단까지 3의 배수단만 출력
		
		for(int gu=1; gu<13; gu++) {
			for(int g=1; g<13; g++) {
				if(gu%3==0) {
					System.out.print(gu+"X"+g+"="+gu*g+"\t");
				}
				
			}if(gu%3==0) {		// >>3단이 12까지 출력되고 난 뒤 한줄 띄기 해주기 위해서 Xg 군락 밖에 걸기!
				System.out.println();
			}
		}
		
		System.out.println("--------------------------------------------------------------");
		//1단 ~ 12단까지 홀수단만 출력 
		
		for(int gu=1; gu<13; gu++) {
			for(int g=1; g<13; g++) {
				if(gu%2!=0) {
					System.out.print(gu+"X"+g+"="+gu*g+"\t");
				}
			}if(gu%2!=0) {
				System.out.println();
			}
		}
		
		/* 스캐너에서 입력 받은 단만 출력(1~9단)
	 	출력할 단을 입력하세요(1~9단) >>>
	 	==========================
	 	1*1=1
	 	1*2=2
	 	.....
	 	1*9=9
	 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("출력할 단을 입력하세요(1~9단) >>>");
		int gugu=sc.nextInt();
		
		for(int g=1; g<10; g++) {
			if(gugu<10) {
			System.out.printf(gugu+"*"+g+"="+gugu*g+"\t"); 
			}
			
		}
		System.out.println("출력할 수 없습니다.");	// 글자 출력 위치 설정을 잘하자... 
		
		sc.close();
	}

}
