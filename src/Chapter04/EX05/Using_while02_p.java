package Chapter04.EX05;

import java.util.Scanner;

public class Using_while02_p {

	public static void main(String[] args) {
		//  스캐너를 사용해서 -1이 될 때까지 정수값을 넣어서 평균
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		int sum=0;
		
		System.out.println("원하는 정수를 넣으세요. 중단하고 싶다면 '0'을 넣으세요.");
		
		int j=sc.nextInt();
		
		while(j!=0) { 
			count++;
			sum+=j;
			j=sc.nextInt();		// ===>> 이게 있어야 계속 입력값을 넣을수 있기 때문
			
		}
		if(count==0) {
			System.out.println("입력한 값이 없습니다. 다시 시도해주세요.");
		}else {
			System.out.println("정수의 모든 합은 "+sum+"입니다.");
			System.out.println("정수의 평균 값은 "+sum/(double)count+"입니다.");
			System.out.println("입력하신 정수의 개수는 "+count+"입니다.");
		}
		
		sc.close();
	}

}
