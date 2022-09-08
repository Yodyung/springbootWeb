package Chapter05.EX03;

import java.util.Arrays;

public class ArgumentOfMainMethod02 {

	public static void main(String[] args) {
		// Main Method로 값 던져 주기.
		
		// args.length 내용 출력 하기.
		System.out.println(args.length);
		
		//Main Method로 넘겨진 값을 자동으로 출력하기.
		System.out.println("--------for문을 사용해서 Main Method args 출력--------");
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
		
		System.out.println();
		System.out.println("=================향상된 for===============");
		for(String k :args) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("==========Arrays.toString()============");
		System.out.println(Arrays.toString(args));
		
		//run 옆에 컨피겨레이션 눌러서 해야함
	}

}
