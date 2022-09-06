package Chapter04.EX05;

import java.util.Scanner;

public class Using_while03_p {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		//힌트 : 문자열을 정수로 변환
		//1. string s = sc.nextline(); 인풋 받는다.
		//2. s.spilt(" ") ; <==공백을 기준으로 잘라서 배열에 저장
		//3. 문자열 string을 정수형으로 변환, integer.perseint()
		//4. 합계와 평균을 구하면 됩니다.
		
		Scanner sc= new Scanner(System.in);
		
		String s;
		
		System.out.println("정수를 입력하세요. 그만을 누르면 멈춥니다.");
		
		
		do {
			s=sc.nextLine();
			String []arr;
			arr=s.split(" ");
			
			if(s.equals("그만")) {break;}
			
			int b=0;
			int sum=0;
			int count=0;
			
			for(int i=0; i<arr.length; i++) {
				b=Integer.parseInt(arr[i]);
				sum+=b;
				count++;
			}
			System.out.println("합계는 "+sum+" 평균은 "+sum/count+" 갯수는 "+count);
			
			
			
			
			
		}
		while(true);
		System.out.println("시스템을 종료합니다.");

	}

}
