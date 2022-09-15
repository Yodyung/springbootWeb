package Chapter07.EX04;

import java.util.Scanner;

class Converter{	//환율을 계산하는 클래스
	//1. 필드
	double rate;	//환율을 저장하는 변수 1$=1377.40
	
	//2. 메소드 생성(달러를 인풋받아서 원화를 반환하는 메소드) toKwr()
	double toKWR(double dollar) {
		return dollar*rate;
	}
	
	//3. 메소드 생성(원화를 인풋받아서 달러를 반환하는 메소드) toUsd()
	double toUSD(double won) {
		return won/rate;
	}
	
	//4. setRate() : 메소드 설정 setter를 사용해서 rate 필드의 값을 할당.
	void setRate(double rate) {
		this.rate=rate;
	}
}


public class Converter_Test {

	public static void main(String[] args) {
		// 네이버에 오늘의 환율을 검색해서 활용.
		// 객체 생성후 스캐너로 환율을 인풋 받아서 setRate() 메소드에 저장 후 
		// 원화 100만원이 몇 달러인지 메소드 인풋 넣어서 출력
		// 달러 100달러가 몇 만원인지 출력
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1달러에 대한 오늘 환율을 입력 하세요.");
		double rate=sc.nextDouble();
		
		//객체 생성
		Converter converter=new Converter();	//기본 생성자 호출(생략됨)
		
		//스캐너로 받은 rate 변수의 값을 setter 주입.
		converter.setRate(rate);
		
		//100만원 ==> 몇 $
		
		System.out.println("원화 100만원은 "+converter.toUSD(1000000)+"$ 입니다.");
		
		//100$ ==> 몇 만원
		
		System.out.println("100$는 "+converter.toKWR(100)+"원 입니다.");
		
		System.out.println("소수점 둘째 자리까지 잘라서 출력하기");
		
		//1. 
		System.out.printf("원화 100만원은 %.2f $ 입니다.",converter.toUSD(1000000));
		System.out.println();
		System.out.printf("100$는 %.2f원 입니다.",converter.toKWR(100));
		System.out.println();
		
		//2. 변수에 더블값을 할당 후 소숫점 2자리까지 변환해서 출력
		System.out.println("---------예시----------");
		double per2 = 3.141592;
			//String으로 변환 후 per2의 변수의 값을 소숫점 2자리까지 출력 후 다시 더블형으로 변환
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
	}

}
