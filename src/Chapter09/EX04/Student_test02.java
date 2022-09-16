package Chapter09.EX04;

class student02{
	static int num=1000;
	int id;
	String name;
	int grade;
	String address;
	int month;
	
	student02() {
		num++;
		id=num;
		grade=4;
		address="서울";
	}
	student02(String name) {
		this();
		this.name=name;
	}
	student02(String name,int grade) {
		this(name);
		this.grade=grade;
	}	
	student02(String name,int grade,String address) {
		this(name,grade);
		this.address=address;
	}
	
	void print() {
		System.out.println("학생 고유아이디 : "+id);
		System.out.println("이름 : "+name+", 학년 : "+grade+", 주소 : "+address);
		System.out.println(month+"월 입니다.");
	}
	
	void setGrade(int grade) {		//setter : grade 값을 할당하는 setter
		if(grade>=1&&grade<=4) {
			this.grade=grade;
		}else {
			System.out.println("잘못된 값을 입력 했습니다. 1-4 까지만 입력하세요.");
			return;
		}
	}
	
	void setMonth(int month) {
		if(month>=1&&month<=12) {
			this.month=month;
		}else {
			System.out.println("잘못된 값을 입력 했습니다. 1-12 까지만 입력하세요.");
			return;
		}
			
	}
	
	
}

class student03{
	//필드의 접근 제어자는 보안을 위해서 private으로 선언 할 수 있음.
	// - 필드의 값을 직접적으로 수정 할 수 없다. (지정한 걸 불러올 수만 있음)
	private static int num=1000;
	private int id;
	private String name;
	private int grade;
	private String address;
	private int month;				//값이 1-12월만 들어올 수 있음
	
	//필드의 접근 제어자를 private으로 설정하면 외부 클래스에서 접근 불가능함.
		//생성자나 메소드(setter)를 사용해서 필드의 내용을 수정. 원하는 값을 제어해서 입력 할 수 있다.
	
	student03() {
		num++;
		id=num;
		grade=4;
		address="서울";
	}
	student03(String name) {
		this();
		this.name=name;
	}
	void print() {
		System.out.println("학생 고유아이디 : "+id);
		System.out.println("이름 : "+name+", 학년 : "+grade+", 주소 : "+address);
	}
	
	public void setGrade(int grade) {		//setter : grade 값을 할당하는 setter
		if(grade>=1&&grade<=4) {
			this.grade=grade;
		}else {
			System.out.println("잘못된 값을 입력 했습니다. 1-4 까지만 입력하세요.");
			return;
		}
	}
	
	public void setMonth(int month) {
		if(month>=1&&month<=12) {
			this.month=month;
		}else {
			System.out.println("잘못된 값을 입력 했습니다. 1-12 까지만 입력하세요.");
			return;
		}
			
	}
	
	
}	

public class Student_test02 {

	public static void main(String[] args) {
		//객체 생성
		student02 s = new student02("최승희",3,"노원");
		
		s.print();

		student02 ss = new student02("예사랑",1,"마포");
		
		ss.print();
		
		//default 접근 제어자 : 같은 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
//		s.num=2000;
//		s.id=100;
//		s.name="hong";
		
		s.setGrade(3);
		s.setMonth(11);
		
		s.print();
		
		//객체 생성
		student03 s3 = new student03();
//		s3.num=2000;		//접근 제어자 : private, 접근 불가함.
		//필드의 값을 직접 입력하는 경우는 넣는 값을 제어할 수 없다.
//		s3.grade=100;	//1-4			private 접근 불가함.
//		s3.month=200;	//1-12


		
		
	}

}
