package Chapter10.EX07;

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
	int count;	//호랑이 수 
	//생성자 : 정수를 인풋 받아서 count 필드에 값을 할당.
	Tiger(int count) {
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("호랑이는 쌩쌩 달립니다.");
	}
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}
	
}
class Eagle extends Animal{
	int count;
	Eagle(int count) {
		this.count=count;
	}
	@Override
	void run() {
		System.out.println("독수리는 날아다닙니다.");
	}
	void eat() {
		System.out.println("독수리는 썩은 고기를 먹습니다.");
	}
	
}
class Fish extends Animal{
	int count;
	Fish(int count) {
		this.count=count;
	}
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다.");
	}
	void eat() {
		System.out.println("물고기는 플랑크톤을 먹습니다.");
	}
	
}
class Dog extends Animal{
	int count;
	Dog(int count) {
		this.count=count;
	}
	@Override
	void run() {
		System.out.println("개는 왕왕 달립니다.");
	}
	void eat() {
		System.out.println("개는 아무거나 잘 먹습니다.");
	}
	
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		//1.객체 생성
		//생성자를 통해서 각각의 필드에 값을 할당.
		
		int total=0;
		
		//객체를 배열에 저장
		Animal[]arr=new Animal[] {new Tiger(70), new Eagle(5), new Fish(50), new Dog(70)};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Tiger) {
				Tiger a =(Tiger) arr[i];
				total+=a.count;
			}else if(arr[i] instanceof Eagle) {
				Eagle e=(Eagle) arr[i];
				total+=e.count;
			}else if(arr[i] instanceof Fish) {
				Fish f=(Fish) arr[i];
				total+=f.count;
			}else {
				Dog d=(Dog)arr[i];
				total+=d.count;
			}
			
		}	
		System.out.println("동물의 총 마리 수는 : "+total);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].eat();
			arr[i].run();
		}
		
		
		
		//for문을 사용해서 출력 : eat, run, 동물의 총 마리수
		
		//포 문을 사용해서 객체를 애니멀 객체로 뽑아서
		//다운캐스팅 해서 필드의 카운트 읽어서 총 더한 값을 출력
		
		//향상된 for문을 사용해서 출력
		
		
		/*
		 메인 메소드 선생님 답변
		 
		 Animal a1=new Animal();
		 Animal a2=new Tiger(10);
		 Animal a3=new Eagle(5);
		 Animal a4=new Fish(50);
		 Animal a5=new Dog(70);
		 
		 Animal[] arr=new Animal[] {a1,a2,a3,a4,a5};
		 
		 for(int i=0; i<arr.length; i++) {
		 int sum=0;
		 
		 	//배열의 각 방에 저장된 객체를 Animal 객체에 저장
		 	Animal aa=arr[i];
		 	aa.eat();		//Animal의 eat() 메소드 : 오버라이딩 된
		 	aa.run(); 		//Animal의 run() 메소드 : 오버라이딩 된
		 	
		 	if(aa instance of Tiger) {
		 		Tiger t1=(Tiger)aa;		// 다운캐스팅 당함
		 		sum +=t1.count;
		 	}	
		 	if(aa instance of Eagle) {
		 		Eagle e1=(Eagle)aa;		// 다운캐스팅 당함
		 		sum +=e1.count;
		 	}	
		 	if(aa instance of Fish) {
		 		Fish f1=(Fish)aa;		// 다운캐스팅 당함
		 		sum +=f1.count;
		 	}	
		 	if(aa instance of Dog) {
		 		Dog d1=(Dog)aa;		// 다운캐스팅 당함
		 		sum +=d1.count;
		 	}	
		 	
		 	System.out.println("동물의 총 마리 수는 : "+sum);
		 
		 
		 */
		

	}
}
