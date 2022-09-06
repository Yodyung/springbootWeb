package Chapter04.EX05;

import java.util.Scanner;

public class Using_while03 {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		//힌트 : 문자열을 정수로 변환
		//1. string s = sc.nextline(); 인풋 받는다.
		//2. s.spilt(" ") ; <==공백을 기준으로 잘라서 배열에 저장
		//3. 문자열 string을 정수형으로 변환, integer.perseint()
		//4. 합계와 평균을 구하면 됩니다.
		
		Scanner sc=new Scanner(System.in);
		 
		String s;
		
		do {
			System.out.println("정수값을 넣으세요. 마지막에 '그만'을 넣어 종료하세요.");
			System.out.println("예) 입력>>> 10 40 50 70 >>>");
			s=sc.nextLine();
			if(s.equals("그만")) {break;}
			String[] arr;
			arr=s.split(" ");
			
			int b;			//각 종목의 구성원을 담는 변수
			int sum=0;		//각 종목의 구성원의 합을 담는 변수
			int count=0;	//각 종목을 카운트 하는 변수
			for(int i=0; i<arr.length; i++) {
				b=Integer.parseInt(arr[i]);
				sum+=b;
				count++;
				
			}
			System.out.println("정수의 갯수 : "+count);
			System.out.println();
			System.out.println("입력한 정수의 합계 : "+sum+" 입력한 정수의 평균 : "+sum/count);
			System.out.println("------------------------------------------------------");
			System.out.println();
		}while (true);
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();

	}

}
