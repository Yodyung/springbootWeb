package Chapter10.EX01;

class Fruit{		// 과일 <== 부모 클래스
	String name;	// 과일 이름
	String color;	// 과일 색깔
	int size;		// 과일의 크기 
	
	void eat() {
		System.out.println("모든 과일은 맛이 있고, 먹을 수 있다.");
	}
	void print() {
		System.out.println(name+" , "+color+" , "+size);
	}
}

class Apple extends Fruit {		//사과 <== 자식 클래스
	//자식 클래스만 가지는 필드1, 메소드1
	
	void apple() {
		name="사과";
		System.out.println("사과는 맛있다.");
	}
	
}

class Orange extends Fruit {		//오렌지 <== 자식 클래스
	//자식 클래스만 가지는 필드2, 메소드2
	
	void orange() {
		name="오렌지";
		System.out.println("오렌지는 맛있다.");
	}
	
}

class Banana extends Fruit {		//바나나 <== 자식 클래스
	//자식 클래스만 가지는 필드3, 메소드3
	
	void banana() {
		name="바나나";
		System.out.println("바나나는 맛있다.");
	}
	
}




public class Using_Inheritance02 {

	public static void main(String[] args) {
		// 
		Apple a=new Apple();
		a.color="red";
		a.size=10;
		a.eat();
		a.apple();
		a.print();
		System.out.println("-------------------------------------------");
		
		Orange o=new Orange();
		o.color="orange";
		o.size=20;
		o.eat();
		o.orange();
		o.print();
		System.out.println("-------------------------------------------");
		
		Banana b=new Banana();
		b.color="yellow";
		b.size=50;
		b.eat();
		b.banana();
		b.print();
		
	}

}
