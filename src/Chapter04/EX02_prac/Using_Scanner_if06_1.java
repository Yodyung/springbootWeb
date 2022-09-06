package Chapter04.EX02_prac;

import java.util.Scanner;

public class Using_Scanner_if06_1 {

	public static void main(String[] args) {
		// 에스프레소, 아메리카노, 아포카토 주문할 경우 가격이 4,900원
		// 카페라떼, 카푸치노, 카페모카 를 주문할 경우 5,900원
		// 그 외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다.

		//출력 : 주문하신 < >는 가격이 <>입니다.
		//그 외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------------------------------------------");
		System.out.println("주문하실 메뉴를 선택하세요.");
		System.out.println("에스프레소 아메리카노 아포카토 카페라떼 카푸치노 카페모카");
		System.out.println("------------------------------------------");
		
		int p=0;
		String m=sc.next();
		
		if(m.equals("에스프레소")||m.equals("아메리카노")||m.equals("아포카토")) {
			p=4900;
		}else if(m.equals("카페라떼")||m.equals("카푸치노")||m.equals("카페모카")) {
			p=5900;
		}else {
			System.out.println("우리 매장에 없는 메뉴입니다. 다시 주문해주시기 바랍니다.");
		}
		
		System.out.printf("주문하신 %s는 %d원 입니다. 결제는 무엇으로 하시겠습니까?",m,p);
		
		sc.close();
		
	}
	
		
	
}
