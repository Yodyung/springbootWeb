package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method05 {
	
	//배열을 매개변수로 가지는 메소드
	static void printArray(int[]a) {
		System.out.println(Arrays.toString(a));
	}
	
	static void printArrayString(String[] s) {
		//메소드의 매개변수로 들어온 배열을 출력
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// 배열을 매개변수로 가지는 메소드

		// 배열을 매개변수로 가지는 메소드 호출
		int[]a= new int[] {1,2,3};
		printArray(a);		//1. 메소드 호출 시 배열 변수에 값을 할당
		
		printArray(new int[] {6,5,4,7});	//2. 객체 생성시 배열 변수의 값을 더해 인풋
		
		// printArray({8,9,10,11});	//3. 오류 발생, 선언과 값을 분리할 수 없어서 오류.
		
		//String 배열을 선언 후 초기화 값을 할당 후 메소드 호출
		System.out.println("---------------------------------------");
		String []ss=new String[] {"hi", "nice", "to", "meet", "you"};
		printArrayString(ss);

		printArrayString(new String[] {"merry","choo-seok","and","happy","choo-seok"});

		// printArrayString({"merry","choo-seok","and","happy","choo-seok"});	선언과 초기화를 함께 하지 않았기에 오류
		
		
		
	}

}
