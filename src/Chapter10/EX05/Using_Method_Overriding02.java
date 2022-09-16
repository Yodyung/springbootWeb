package Chapter10.EX05;

class Animal{
	void cry() {
		System.out.println("모든 동물은 웁니다.");
	}
}
class Birds extends Animal{
	@Override		//문법 오류 방지, 없어도 알아서 똑같은 이름으로 해놓으면 오버라이딩 됨
	void cry() {
		System.out.println("짹짹 (0 30)");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("애-옹");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("월울어룽러컹컼엌ㅇ컹");
	}
}

public class Using_Method_Overriding02 {

	public static void main(String[] args) {
		//1. 각각의 타입으로 선언+각각의 타입으로 생성
		Animal a1=new Animal();
		Birds b1=new Birds();
		Cat c1=new Cat();
		Dog d1=new Dog();
		
		a1.cry();		//Animal의 cry()를 호출
		b1.cry();		//Birds의 cry()를 호출
		c1.cry();		//Cat의 cry()를 호출
		d1.cry();		//Dog의 cry()를 호출
		
		System.out.println("=============================");

		//2. Animal 타입으로 선언 + 자식 클래스로 객체 생성
			//자식의 객체를 생성할 때 부모타입으로 정의 후 부모의 메소드를 호출 시 오버라이딩 된 메소드 출력
			//오버라이딩을 사용해서 하나의 타입으로 정의, 배열이나 컬렉션에 저장해서 관리를 쉽게 할 수 있다.
		
		Animal a11=new Animal();
		Animal a2=new Birds();
		Animal a3=new Cat();
		Animal a4=new Dog();
		
		a11.cry();
		a2.cry();		//a2.cry() : Animal의 cry()를 호출 ==> 오버라이딩 된 메소드가 출력
		a3.cry();		//a3.cry() : Animal의 cry()를 호출 ==> 오버라이딩 된 메소드가 출력
		a4.cry();		//a4.cry() : Animal의 cry()를 호출 ==> 오버라이딩 된 메소드가 출력
	
		//Animal 타입으로 선언이 되어 있으므로 배열이나 컬렉션에 넣어서 아주 쉽게 관리
		// 배열의 특징 : 1.동일한 타입을 저장, 2.방의 크기가 선언되면 바꿀 수 없다.
		
		int [] arr1=new int[5];				//배열의 방 크기 지정 후 값을 할당 
		int [] arr2=new int[] {1,2,3,4};	//배열 선언과 동시에 값을 할당
		//타입[] 배열변수 =
		
		//객체를 배열에 저장: Animal 객체를 배열에 저장
		System.out.println("===============객체를 배열에 저장 후 출력===============");
		Animal[] arr3= new Animal[] {a1,a2,a3,a4};
		
		//for문을 사용해서 출력
		for(int i=0; i<arr3.length; i++) {
			arr3[i].cry();		//Animal 의 cry()를 호출 시 객체에서 오버라이딩 된 메소드가 출력
		}
	
		//향상된 for문을 사용해서 출력
		for(Animal k : arr3) {
			k.cry();
		}
		
	}

}
