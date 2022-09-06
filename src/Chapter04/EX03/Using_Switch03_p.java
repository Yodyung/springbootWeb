package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03_p {
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
	System.out.println("gold/silver/bronze");
	
	String medal=sc.next();
	
	switch(medal) {
	case"gold":
		System.out.println("금메달입니다.");
		break;
	case"silver":
		System.out.println("은메달입니다.");
		break;
	case"bronze":
		System.out.println("동메달입니다.");
		break;
		default: {
			System.out.println("메달이 없습니다.");
		}
	}
	
	System.out.println("확인을 원하시는 월을 입력해주세요.(1-12)");
	
	int month=sc.nextInt();
	
	switch(month) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.printf("선택하신 %d월은 31일까지 있습니다.",month);
		break;
	case 2:
		System.out.printf("선택하신 %d월은 28일까지 있습니다.",month);
		break;
	case 4: case 6: case 9: case 11:
		System.out.printf("선택하신 %d월은 30일까지 있습니다.",month);
		break;
		default:
			System.out.println("선택하신 달이 존재하지 않습니다.");
	}
	
	sc.close();
}
}
