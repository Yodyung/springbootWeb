package Chapter10.EX06;

class Animal{
	//자식 클래스에서 2개의 메소드를 오버라이딩
	//Animal 타입으로 정의, 배열에 저장 후 오버라이딩 된 메소드 출력(for, 향상된 for문)
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 쌩쌩 달립니다.");
	}
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
	
}
class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 날아다닙니다.");
	}
	void eat() {
		System.out.println("독수리는 썩은 고기를 먹습니다.");
	}
	
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다.");
	}
	void eat() {
		System.out.println("물고기는 플랑크톤을 먹습니다.");
	}
	
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 왕왕 달립니다.");
	}
	void eat() {
		System.out.println("개는 아무거나 잘 먹습니다.");
	}
	
}

public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		Animal a1=new Tiger();
		Animal a2=new Eagle();
		Animal a3=new Fish();
		Animal a4=new Dog();
		
		a.eat();
		a.run();
		a1.eat();
		a1.run();
		a2.eat();
		a2.run();
		a3.eat();
		a3.run();
		a4.eat();
		a4.run();
		System.out.println("-------------------------------------------");
		
		Animal[]arr=new Animal[] {a,a1,a2,a3,a4};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].eat();
			arr[i].run();
		}
		System.out.println("-------------------------------------------");
		
		for(Animal k : arr) {
			k.eat();
			k.run();
		}
		
		
		

	}

}
