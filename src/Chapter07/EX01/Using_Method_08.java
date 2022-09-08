package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method_08 {
	
	//가변 길이 배열 매개 변수
	
	static void method1 (int...values) {	//가변 길이 급히 입력 배열 예제변수)
	/*
	 for문으로 출력
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		
	
	향상된 for문으로 출력
	 *static void method1 (int...values) {	//가변 길이 급히 입력 배열 예제변수)
	
		for(int k : values) {
			System.out.print(k+" ");		
		}
		
		System.out.println();
	}
	*/
		
		System.out.println(Arrays.toString(values));
	}
	
	static void method2(String...values) {
		//임의의 문자열을 입력 받아 출력
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		
		for(String k :values) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(values));
		
	}
	
		
	
	
	
	
	public static void main(String[] args) {
		// 가변 길이 메소드(가변 길이 메소드(FlexableSizeArray Argument);
		// 가변 길이 배열 매개변수 (FixableSizeArray Argument)

		method1 (1,2);
		
		method1 (1,2,3,4,5);
		
		method1 (1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("=============================");
		
		method2("예사랑","예소은","홍길동");
		System.out.println();
		
		method2("호랑이","토끼");
		System.out.println();
		
		method2("금붕어","가물치","잉어","악어","붕어");
		System.out.println();
		
		
	}

}
