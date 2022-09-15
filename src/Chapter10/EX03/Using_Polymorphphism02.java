package Chapter10.EX03;

class Animal{	//최상위 부모 클래스
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹는다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다.");
	}
}
class Tiger extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다.
	int tiger;
	void tigereat() {
		System.out.println("호랑이는 다른 동물을 잡아먹는다.");
	}
	
}
class Eagle extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다.
	int eagle;
	void eaglefly() {
		System.out.println("독수리는 하늘을 날아다닌다.");
	}
	
}
class Dog extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다.
	int dog;
	void dogcry() {
		System.out.println("개는 끼잉끼잉 운다.");
	}
	
}
class Doggy extends Dog{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다.
	void dogcry() {
		System.out.println("강아지는 끼잉끼잉 소리 낸다.");
	}
	
}

public class Using_Polymorphphism02 {

	public static void main(String[] args) {
		
		//1. Animal 객체를 Animal 타입으로 생성
			//a1은 Animal타입만 가진다. Animal 클래스의 필드와 메소드만 접근 가능
		Animal a1=new Animal();
		
		//2. Tiger 객체를 Tiger 타입으로 생성
		//t1은 Animal, Tiger 타입을 가지고 Tiger로 지정. Animal, Tiger 클래스의 필드와 메소드 접근 가능
		Tiger t1=new Tiger();
		
		//3. Tiger 객체를 Animal 타입으로 생성 // 업 캐스팅
		//a2은 Animal, Tiger 타입을 가지고 Animal로 지정. Animal 클래스의 필드와 메소드만 접근 가능
		Animal a2=new Tiger();
		
		//4. Dog 객체를 Dog 타입으로 생성
			//d1은 Animal, Dog를 내포하고 있고, Dog 타입으로 지정, Animal, Dog 클래스의 필드와 메소드 접근 가능
		Dog d1=new Dog();
		
		Animal a3=new Dog();

		Doggy dg1=new Doggy();
		
		Dog d2=new Doggy();
		
		
	}

}
