package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*1. 문제
		 스캐너로 "gold"넣으면 "금메달입니다."를 출력
		 스캐너로 "silver"넣으면 "은메달입니다."를 출력
		 스캐너로 "bronze"넣으면 "동메달입니다."를 출력
		 스캐너로 "그 외"넣으면 "메달이 없습니다."를 출력
		
		 2. 문제
		 스캐너로 월을 인풋받으면 
		 "<ㅇ>월은 <ㅇㅇ>일까지 있습니다." 출력 
		 
		*/
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("메달의 색깔을 입력해주세요.");
		String m=sc.next();
		
		
		switch(m) {
		case "gold": 
			System.out.println("금메달입니다.");
			break;
		case "silver":
			System.out.println("은메달입니다.");
			break;
		case "bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		
		}
		
		System.out.println("---------------------------------");
		System.out.println("월을 입력해주세요.(1-12)");
		int mo=sc.nextInt();
		int s=0;
		
		switch(mo) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			s=31;
			System.out.printf("%d월은 %d일까지 있습니다.",mo,s);
			break;
		case 2:	
			s=28;
			System.out.printf("%d월은 %d일까지 있습니다.",mo,s);
			break;
		case 4: case 6: case 9: case 11:
			s=30;
			System.out.printf("%d월은 %d일까지 있습니다.",mo,s);
		default:
			System.out.println("존재하지 않는 달입니다.");
			
		
		
		
		
		
		}
		
		sc.close();
	}

}
