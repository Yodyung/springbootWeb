package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		//switch문으로 처리

		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("주문하실 메뉴를 선택해주세요.");
		System.out.println("----------------------");
		System.out.println("에스프레소/아메리카노/아포카토/카페라떼");
		System.out.println("----------------------");
		
		String m=sc.next();
		int g=0;
		
		switch(m) {
		case "아메리카노": case "에스프레소": case "아포카토":
			g=2500;
			System.out.printf("주문하신 %s는 %d원 입니다.",m,g);
			break;
			
		case "카페라떼": case "카페라테":
			g=3500;
			System.out.printf("주문하신 %s는 %d원 입니다.",m,g);
			break;
		
		default:
			System.out.printf("주문하신 %s 메뉴는 매장에 없는 메뉴입니다.",m);
		}
		
		sc.close();
		
		
		
		
		
		
		
	}

}
