package Chapter10.EX09;

public class Customer {

	int id;					//고객 ID
	String name;			//고객 이름
	String grade;			//고객 등급(vip, gold, silver)
	int bonuspoint;			//고객의 등급에 따라 포인트 적립(10,5,3%)
	double bonusratio;		//물품 구매시 할인률

	Customer() {
		//필드의 기본 값 할당을 메소드 호출로 적용
		initCustomer();		// this.initCustomer();, 자신 객체의 메소드 호출
		
	}
	
	Customer(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void initCustomer() {
		this.grade="Sliver";
		this.bonusratio=0.01;
		
	};

}
