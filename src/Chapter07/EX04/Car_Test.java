package Chapter07.EX04;

class Car {
	//1.필드
	String company; 	//제조회사
	String model;		//자동차 모델
	String color;		//색깔
	double maxSpeed;	//최대 출력

	//2.생성자
	Car(){}
	
	Car(String company, String model, String color, double maxSpeed) {
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	//3.메소드(show() : 필드의 값을 출력)
	void show() {
		System.out.println(company+"의 "+model+", 색깔은 "+color+", 최고 속력은 "+maxSpeed+"km/h 입니다.");
	}
	
	//4.메소드(getter setter)
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}




public class Car_Test {

	public static void main(String[] args) {
		// 객체 생성
		// car1 현대자동차 그랜져 <==필드의 값을 직접 입력, 출력
		Car car1=new Car();
		car1.company="현대자동차";
		car1.model="그랜져";
		car1.color="검정";
		car1.maxSpeed=210.5;
		
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		System.out.println("------------------------------");
		
		// car2 쌍용자동차 체어맨<==생성자를 통해서 값 입력/ show() 값 출력
		Car car2=new Car("쌍용자동차","체어맨","빨강",245.5);
		car2.show();
		System.out.println("------------------------------");
		
		// car3 벤츠 마이바흐<==메소드(getter setter) 입력, 출력
		Car car3=new Car();
		car3.setCompany("벤츠");
		car3.setModel("마이바흐");
		car3.setColor("회색");
		car3.setMaxSpeed(280.9);
		
		car3.getCompany();
		car3.getModel();
		car3.getColor();
		car3.getMaxSpeed();
		
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed());
		
	}

}
