package Chapter05.EX01;

import java.util.Scanner;

public class Using_Array09 {

	public static void main(String[] args) {
		//
		Scanner sc=new Scanner(System.in);
		
		//라인 전체를 통채로 인풋 받음 > ex.국어 영어 수학 과학 사회
		//sc.next() 		//국어
		//sc.nextLine()		//국어 영어 수학 과학 사회
		
		System.out.println("문자열을 입력하세요(라인 전체)>>");
		
		String s1=sc.nextLine();
		System.out.println(s1);
		
		System.out.println("문자열을 입력하세요.(한 단어:문자열)>>");
		String s2=sc.next();
		System.out.println(s2);
		
		
		

		
		
		
		
		
		sc.close();
	}

}
