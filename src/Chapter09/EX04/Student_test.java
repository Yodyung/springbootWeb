package Chapter09.EX04;

class Student{
	
	static int serialNum= 1000;
	int studentID;			//학생 공유 ID
	String studentname;		//학생 이름
	int grade;				//학년 : 기본 값으로 4학년
	String address;			//주소 : "서울"
	
	Student() {
		serialNum++;
		studentID=serialNum;
		grade=4;
		address="서울";
	}
	Student(String studentname) {
		this();
		this.studentname=studentname;
		
	}
	Student(String studentname,int grade) {
		this(studentname);
		this.grade=grade;
	}
	Student(String studentname,int grade,String address) {
		this(studentname,grade);
		this.address=address;
	}
	
	void print() {
		System.out.println("학생 아이디 : "+studentID);
		System.out.println("학생 이름 : "+studentname+", "+grade+"학년, 주소는 "+address+"입니다.");
		System.out.println();
		
	}
}

public class Student_test {

	public static void main(String[] args) {
		//객체를 생성 시 자동으로 학번이 1000번부터 1씩 자동으로 증가
		// studentID : 1000부터 학생 개체를 생성할 때마다 고유한 값으로 적용 되어 있어야 한다.
		
		 Student lee= new Student("이지원");	//1001
		 lee.print();
		 
		 Student hong= new Student("홍지원",1);	//1002
		 hong.print();
		 
		 Student jong= new Student("종지원",3,"부산");	//1002
		 jong.print();
		 
		 Student gong= new Student("공지원",2,"경주");	//1002
		 gong.print();
		 
		 Student song= new Student("송지원",1,"제주도");	//1002
		 song.print();
		 
		 Student bong= new Student("봉지원");	//1002
		 bong.print();

	}

}
