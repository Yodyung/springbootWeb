package Chapter07.EX05;

//Aa 클래스 : 여러개의 생성자 사용 시 this() 없이 사용한 경우 : 중복된 값을 매번 입력해야 함.

class Ab {
	int m1, m2, m3, m4 ;	//정수 값을 담는 필드 4개 선언
	Ab() {
		m1=1; m2=2; m3=3; m4=4;
	}
	Ab(int a) {		//매개변수 1개
		m1=a; m2=2; m3=3; m4=4;
	}
	Ab(int a, int b) {		//매개변수 2개
		m1=a; m2=b; m3=3; m4=4;
	}
	Ab(int a, int b, int c) {		//매개변수 3개
		m1=a; m2=b; m3=c; m4=4;
	}
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}
}

//Bb 클래스 : 여러개의 생성자 사용 시 this() 사용한 경우 : 중복된 값을 제정
class Ba {
	int m1, m2, m3, m4;
	Ba(){						//기본 생성자, 각 필드의 초기값을 할당
		m1=1; m2=2; m3=3; m4=4;
	}
	Ba(int a){					//기본 생성자, 각 필드의 초기값을 할당
		this();
		m1=a;
	}
	Ba(int a, int b){						//기본 생성자, 각 필드의 초기값을 할당
		this(a);
		m2=b;
	}
	Ba(int a, int b, int c){						//기본 생성자, 각 필드의 초기값을 할당
		this(a,b);
		m3=c;
	}
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}
}


public class ThisMethod02 {

	public static void main(String[] args) {
		//1. 3개의 객체 생성(this 미사용)
		System.out.println("-------3개의 객체 생성(this 미사용)---------");
		
		Ab ab1=new Ab();	//기본 생성자 호출
		ab1.print();
		
		Ab ab2=new Ab(10);
		ab2.print();
		
		Ab ab3=new Ab(10,20);
		ab3.print();
		
		//2. 3개 객체 생성(this 사용)
		System.out.println("-------------------------------------");
		
		Ba ba1=new Ba();
		ba1.print();

		Ba ba2=new Ba(77);		//매개변수 1개인 생성자 호출
		ba2.print();
		
		Ba ba3=new Ba(77,88);	//매개변수 2개인 생성자 호출
		ba3.print();
		
	}

}
