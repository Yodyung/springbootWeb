package Chapter05.EX04;

import java.util.Arrays;

public class Using_String06 {

	public static void main(String[] args) {
		// String 의 다양한 메소드
		//5. 문자열 수정(toLowerCase(), toUpperCase())
		//				소문자로 변환		대문자로 변환

		String str1="Java Study";
		
		System.out.println(str1.toLowerCase());		//소문자로 출력
		System.out.println(str1.toUpperCase());		//대문자로 출력
		System.out.println("-------------------------------------");
		
		//replace(원본, 수정)		// 원본을 수정으로 변환해라
		String str2=str1.replace("Study","공부");
		
		System.out.println(str1.replace("Study","공부"));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("-------------------------------------");
		
		//substring () : 글자를 잘라서 출력 (0,5) = 0은 포함, 5는 미포함
		System.out.println(str1.substring(0,5));	//index 0부터~index 5 전(앞)까지 잘라라
			//java
		System.out.println(str1.substring(3,8));	//3은 포함, 8은 미포함
			//a Stu
		
		System.out.println(str1.substring(5));		//index 5방부터 위로 모두 자름
			//Study
		System.out.println("-------------------------------------");
		
		//split() : 특정 문자를 기준으로 잘라서 배열에 저장
			//	여러 기준으로 잘라서 strArr1 변수에 저장함
		String[] strArr1 = "abc/def-ghi jkl".split("/|-| ");	// | --> or 일때 넣기
		System.out.println(Arrays.toString(strArr1));
		
		for (int i=0; i<strArr1.length; i++) {
			System.out.print(strArr1[i]+" ");
		}
		System.out.println();
		
		for(String k:strArr1) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		String a="오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 이지요?";
		String[]arrr =a.split(" ");
		
		System.out.println(Arrays.toString(arrr));
		
		for(int i=0; i<arrr.length; i++) {
			System.out.print(arrr[i]+" ");
		}
		System.out.println();
		
		for(String k:arrr) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		//trim() : 좌우의 공백을 제거
		System.out.println("           abc           ".trim());
		
		//6. 문자열 비교 ( == ) : 참조 자료형일때 stack의 주소를 비교
		String str3 = new String ("java");
		String str4 = new String ("java");
		String str5 = new String ("Java");
		
		System.out.println(str3==str4); 	//false <==주소를 비교 했기 때문
		System.out.println(str4==str5); 	//false <==주소를 비교 했기 때문
		System.out.println(str3==str5); 	//false <==주소를 비교 했기 때문
		System.out.println("-------------------------------------");
		
		//equals() : heap의 값을 비교
		System.out.println(str3.equals(str4));	//true <==값을 비교했기 때문
		System.out.println(str3.equals(str5));	//false
			//equalsIgnoreCase() : 대소문자 구분하지 말고 값을 비교하라.
		System.out.println(str5.equalsIgnoreCase(str4));	//true	<==대소문자 구별을 무시했기 때문
		
		
		
	}

}
