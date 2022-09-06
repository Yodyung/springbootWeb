package Chapter04.EX04;

import java.util.Scanner;

public class Using_for02 {

	public static void main(String[] args) {
		
		// for문을 사용해서 스캐너로 5개의 값을 인풋 받아 출력
		
		Scanner sc= new Scanner(System.in);
		
		
		String s;
		for(int i=0; i<5; i++) {	//0,1,2,3,4
			s=sc.next();
			System.out.println(s);
		}
		
		
		//for문 내에서 변수 선언시 for문 내에서만 사용
		//	-클래스 내에서 재사용이 가능함
		
		int a;		//전역 변수 : for문 밖, 안 모두 사용 가능
		a=0;
		
		for(int i=0; i<4; i++) {		//0,1,2,3
			//i : 지역 변수, for 문 내에서만 사용 가능
			System.out.println(i);
			System.out.println(a);
		}
		System.out.println(a);
		
		

		
		
		sc.close();
		
	}

}
