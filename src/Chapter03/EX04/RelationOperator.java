package Chapter03.EX04;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 : True, False로 값을 반환
		System.out.println(5<2);	//f
		System.out.println(5>2);	//t
		System.out.println(5<5);	//f
		System.out.println(5<=5);	//t
		System.out.println(5>=5);	//t
		
		//등가비교 : 
		//  ==  : 두 값이 같을 때(true)  !=  : 두 값이 같지 않을 때.(true)
		
		int a =5;
		int b =2;
		int c =5;
		
		System.out.println("============");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a!=b);
		System.out.println(a!=c);
		System.out.println("============");
		
		//참조 자료형일때 등가비교. (객체의 참조주소를 비교하므로 false가 나옴) - 메모리에 저장되는 위치가 다르기 때문
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);	//false 가 나옴 나중 객체 다룰때 배울 예정이라함. 객체의 번지수를 비교함

		System.out.println("============");
		System.out.println(str1);	//객체의 번지수를 출력
		System.out.println(str2);	//
		
	}

}
