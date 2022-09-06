package Chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		//탁구, 야구, 축구, 농구, 씨름
		//각 운동 종목의 구성원 수의 합과 평균을 구하세요.
		
		String s;
		
		 
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요.>>>>");
			s=sc.nextLine();
			int su=0;
			int sum=0;
			int count=0;
			
			String arr[];
			arr=s.split(" ");
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			for(int i=0; i<arr.length; i++) {
				if(i%2!=0) {
					su=Integer.parseInt(arr[i]);
					sum+=su;
					count++;
				}
			}
			
			if(s.equals("그만")) {
				break;
			}
			System.out.println("구성원의 합 : "+sum);
			System.out.println("구성원의 평균 : "+sum/count);
			
				
			
		}while (true);
		System.out.println("프로그램을 종료합니다.");

	}

}
