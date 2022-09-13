package Chapter07.EX05;

class Book{
	
	String bookname;
	String author;
	
	Book() {
		bookname="책 이름 없음";
		author="작자 미상";
	}
	
	Book(String bookname) {
		this();
		this.bookname=bookname;
	}
	
	Book(String bookname, String author) {
		this(bookname);		//this()메소드 : 생성자 호출
		this.author=author;	//this 키워드 : 자신의 객체의 필드, 메소드 가르킬 때 사용함.
	}
	
	void print() {		//메모리의 필드 값을 출력해줌
		System.out.println("책의 이름 : "+bookname+"이고, 책의 저자 : "+author+"입니다.");
	}
	
}



public class ThisMethod03 {

	public static void main(String[] args) {
		
		//1. 기본 생성자 호출
		System.out.println("기본생성자 호출--------------------------");
		Book book1=new Book();
		book1.print();
		
		System.out.println("매개변수가 1개인 생성자 호출--------------------------");
		Book book2=new Book("홍길동전");
		book2.print();
		
		System.out.println("매개변수가 2개인 생성자 호출--------------------------");
		Book book3=new Book("날개","이상");
		book3.print();
		
		System.out.println("매개변수가 2개인 생성자 호출--------------------------");
		Book book4=new Book("어린왕자","생떽쥐베리");
		book4.print();
		
		
	}

}
