package Chapter07.EX01;

public class Using_Method04 {
	
	//같은 클래스에서 메소드 호출
	//main method는 Static 키가 붙은 메소드
	//Static 메소드에서는 인스턴스 메소드를 직접 호출이 불가능 (객체화 후 호출은 가능)
	//Static 메소드는 직접 호출이 가능
	
	static void print() {
		System.out.println("그만해 안녕^^");
	}

	static int twice (int k) {		//twice : 값을 두배로 올려주는 메소드
		return k*2;
	}
	
	static double sum (int m, double l) {		//두 값을 받아서 더해서 되돌려줌
		return m+l;
	}
	
	
	public static void main(String[] args) {
		//같은 클래스 내부에서 메소드 호출
		
		print(); 		//print에 설정한 문구가 나옴
		
		int a=twice(4);	//twice (4)
		System.out.println(a);
		System.out.println(twice(77));
		
		double b= sum(a, 5.8);
		System.out.println(b);

	}

}
