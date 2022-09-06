package Chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02_p {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 선택해주십시오");
		System.out.println("에스프레소/아메리카노/카페라떼/딸기라떼");
		
		int price=0;
		String menu=sc.next();
		
		switch(menu) {
		case"에스프레소": case"아메리카노":
			price=2900;
			System.out.printf("주문하신 %s는 %d원 입니다.",menu,price);
			break;
			
		case"카페라떼": case"딸기라떼":
			price=3900;
			System.out.printf("주문하신 %s는 %d원 입니다.",menu,price);
			break;
			
			default: {
				System.out.println("주문하신 메뉴는 없는 메뉴입니다.");
			}
		}
		sc.close();		//<꼭 닫자...
		
		
	}
}
