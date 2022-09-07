package Chapter06.EX01;

public class Student {
	
	//필드 : 클래스 블락에 선언된 변수 - Heap 영역에 저장됨, 강제 초기화 됨
	int kor ; //국어 점수
	int eng ; //영어 점수
	int mat ; //수학 점수
	String name ;	//학생 이름
	
	//생성자
	Student(){} //기본 생성자, 생략 가능
	Student(int kor, int eng, int mat, String name){	//지역변수 : kor, eng, mat, name
		this.kor= kor;		//this 키워드 : 자신의 필드 값을 뜻함.
		this.eng= eng;
		this.mat= mat;
		this.name= name;
	}
	
	//메소드 : 합과 평균을 계산해서 출력 해주는 메소드
	void call() {
		int sum;
		sum=kor+eng+mat;
		double avg;
		avg=sum/3.0;
		System.out.println(name+"의 총 점수는 "+sum+"점 이고, 평균은 "+avg+"점 입니다.");
	}
	

}
