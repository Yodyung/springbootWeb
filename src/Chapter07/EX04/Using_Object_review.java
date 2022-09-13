package Chapter07.EX04;

class Person {
	// class : 객체를 생성하기 위한 템플릿(틀), 붕어빵을 만들어 내기 위한 붕어빵 기계
	// Object(객체,인스턴스) : 붕어빵, 설계도에 따라 만들어진 건축물 <== 인스턴스화  
	
	//1. 필드 : 클래스 블락에서 선언된 변수(heap), 지역변수 : 메소드 블락에서 선언된 변수(stack)
	String name;	//이름				:null
	float height;	//키(실수)			:0.0
	float weight;	//몸무게(실수)			:0.0
	int age;		//나이				:0
	
	//2. 생성자 (Constructor) :1. 리턴타입이 없다. 2. 클래스 이름과 동일해야 한다.
			//필드의 기본값을 초기화
			//생성자 오버로딩 : 생성자 이름은 동일, 식별자(인풋 매개변수 타입, 갯수)
	Person () {		//기본 생성자 : 인풋 값이 비어있는 생성자, 생략 가능
		
	}
	Person (String s) {	//this 키워드 없이 필드에 값 할당. 면수 명이 다르다.
		name= s;
	}
	Person (String name, Float height) {		//this : 인풋 매개변수명, 값을 받는 변수, 필드명이 동일할 경우
		this.name=name;
		this.height=height;
	}
	Person (String name, Float height, float weight,int age) {		//this : 인풋 매개변수명, 값을 받는 변수, 필드명이 동일할 경우
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.age=age;
		
	}
	
	//3. 메소드(함수) : 기능을 실행하는 코드가 저장. 호출 시 작동, 메소드명();
	
	void show() {		//필드의 내용을 출력하는 메소드
		System.out.println(name+","+height+","+weight+","+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//4. getter Setter <============= 필드의 내용을 룰력, 
	
	
}




public class Using_Object_review {

	public static void main(String[] args) {
		// 메인 메소드에서 객체 생성 할 수 있음.
		
		//1. 기본 생성자 호출
		Person person=new Person();
		//필드 내용 출력(1. 객체 명으로 출력)
		
		System.out.println(person.name);
		System.out.println(person.height);
		System.out.println(person.age);
		System.out.println(person.height);
		System.out.println("-----------getter사용-------------");
		
			//getter를 사용해서 필드의 내용을 출력(필드의 값을 리턴)
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		System.out.println(person.getAge());
		System.out.println("-----------show 메소드 사용-------------");
		
			//show() : 필드의 내용을 출력
		person.show();
		
		//2. 매개변수가 1개인 생성자 호출
		System.out.println("----------------------------");
		Person Lee = new Person("예사랑");
		System.out.println(Lee.name);
		System.out.println(Lee.height);
		System.out.println(Lee.age);
		System.out.println(Lee.height);
		
		Lee.show();
		
		//3. 매개변수가 4개인 생성자 호출
			System.out.println("----------------------------");
			Person Hong = new Person("예사랑",159.5F,42.3F,29);
			System.out.println(Hong.name);
			System.out.println(Hong.height);
			System.out.println(Hong.age);
			System.out.println(Hong.height);
			
			Hong.show();
		
			//Setter를 사용해서 필드의 값 할당, Getter를 사용해서 필드의 값 출력
			System.out.println("setter and getter-----------------");
			Person Ye = new Person();
			
			//setter를 사용해서 필드가 값 할당
			Ye.setName("예사랑");
			Ye.setHeight(159.6F);
			Ye.setWeight(42.3F);
			Ye.setAge(29);
		
			//Getter를 사용해서 필드의 값을 호출
			Ye.getName();
			Ye.getHeight();
			Ye.getWeight();
			Ye.getAge();
			System.out.println(Ye.getName());	
			System.out.println(Ye.getHeight());	
			System.out.println(Ye.getWeight());	
			System.out.println(Ye.getAge());	
	}

}
