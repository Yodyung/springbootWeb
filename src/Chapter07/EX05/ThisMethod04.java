package Chapter07.EX05;

class Car{
	String companyname;		//현대 자동차
	String color;			//검정
	double maxSpeed;		//200.0 km/h
	
	//생성자
	Car() {
		companyname="현대자동차";
		color="검정";
		maxSpeed=200.0;
		
	}
	Car(String companyname) {
		this();
		this.companyname=companyname;
		
	}
	Car(String companyname, String color) {
		this(companyname);
		this.color=color;
	}
	Car(String companyname, String color, double maxSpeed) {
		this(companyname,color);
		this.maxSpeed=maxSpeed;
	}
	
	//필드의 모든 값을 출력하는 메소드
	void print() {
		System.out.println(companyname+" "+color+" "+maxSpeed+"km/h");
	}
}


public class ThisMethod04 {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.print();
		
		Car car2=new Car("쌍용자동차");
		car2.print();
		
		Car car3=new Car("쌍용자동차","빨강");
		car3.print();
		
		Car car4=new Car("벤츠","핑크",244.0);
		car4.print();

	}

}
