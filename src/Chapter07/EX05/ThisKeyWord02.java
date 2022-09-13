package Chapter07.EX05;

//반드시 this keyword를 사용해야 하는 경우 : 
// - 생성자, 메소드, 매개변수 이름, 필드 이름이 동일한 경우 필드 이름에 this 를 명시해야 한다.

class AA {
	int m;
	int n;
	
	void init(int m,int n) {		//this 키를 명시하지 않는 경우
		m=m;		// 3개의 m 모두 지역 변수
		n=n;
	}
}

class BB {
	int m;
	int n;
	
	void init(int m,int n) {		//this 키를 명시한 경우
		this.m=m;		//this.m : 필드, m : 지역변수
		this.n=n;
	}
}


public class ThisKeyWord02 {

	public static void main(String[] args) {
		//
		AA aa=new AA();	//기본 생성자 호출
		aa.init(10, 20);			//this 키를 명시하지 않은 경우
		System.out.println(aa.m);	//0
		System.out.println(aa.n);	//0
		
		BB bb=new BB();	//기본 생성자 호출
		bb.init(10, 20);			//this 키를 명시한 경우
		System.out.println(bb.m);	//입력 값이 출력됨
		System.out.println(bb.n);

	}

}
