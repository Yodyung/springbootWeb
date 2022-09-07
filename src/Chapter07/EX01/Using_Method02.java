package Chapter07.EX01;

class C{
	/*
	 선생님 답변
	 class Circle {
	 	int radius;
	 	String name;
	 	
	 	
	 	Circle(int radius, String name) {
	 		this.radius=radius;
	 		this.name=name;
	 		
	 	}	
	 
	 	void call() {
	 	double area=3.14*radius*radius;
	 	System.out.println(name+"의 넓이는 "+area+"입니다.");
	 	}
	 
	 }
	 =========================================================
	 main 메소드에 입력할 것
	 
	 Circle pizza = new Circle(10, "피자")
	 pizza.call();
	 
	 Circle donut = new Circle(10, "도넛")
	 donut.call();
	 
	 */
	int pizza;		//피자 지름	//도넛 지름
	int sum;		//지름 계산
	String name;
	
	C(int pizza, int sum, String name) {
		this.pizza=pizza;
		this.sum=sum;
		this.name=name;
	}
	
	
	void food(int p) {
		int sum=pizza;
		double avg;
		avg=(pizza)*3.14;
		System.out.println(name+"의 지름은 "+sum+"이고 둘레는 "+avg+"입니다.");
		
	}
	
}


public class Using_Method02 {

	public static void main(String[] args) {
		// 원의 반지름을 넣었을 때 전체 넓이를 구하는 객체를 생성 후 출력 3.14*반지름
		// 피자 : 10 (반지름)
		// 도넛 : 5
		// 피자의 넓이는 00 입니다.

		C pizza=new C(10, 10, "피자");
		
	}

}
