package Chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// 에스프레소, 아메리카노, 아포카토 주문할 경우 가격이 3,500원
		// 카페라떼 를 주문할 경우 4,000원
		// 그 외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다.

		//출력 : 주문하신 < >는 가격이 <>입니다.
		//그 외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 선택해주세요.");
		System.out.println("-----------------------");
		System.out.println("에스프레소 아메리카노 아포카토 카페라떼");
		System.out.println("-----------------------");
		
		String order=sc.next();
		int aa=2500;
		int bb=3500;
		
		if(order.equals("아메리카노")||order.equals("에스프레소")||order.equals("아포카토")) {
			System.out.println("주문하신 "+order+"는 "+aa+"원 입니다." );
		}else if(order.equals("카페라떼")||order.equals("카페라테")) {
			System.out.println("주문하신 "+order+"는 "+bb+"원 입니다." );
		}else {
			System.out.println("우리 매장에는 없는 메뉴입니다. 다른 메뉴를 주문해주세요.");
		}
	
		//price를 int price; 선언 뒤 if문 else if문 안에서 price=2500 3500으로 설정해줄 수 있음
		//설정 후 print f로 마지막에 선언 가능
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
