package Chapter05.EX04;

import java.util.Arrays;

public class Using_String05 {

	public static void main(String[] args) {
		/*
		String의 주요한 특징 : 다른 클래스에는 없는 특별한 기능
		 1. 수정이 불가하다. ==> 새로운 값을 힙 영역에 생성.
		 2. 리터럴로 변수의 값을 넣을 경우 동일한 문자열은 주소를 공유
		 3. 객체 자체를 출력할 때 객체의 주소가 출력 되는것이 아닌 객체의 값이 출력
					(toString()메소드 가 재정의 되어 있다.)
		 4. 다양한 메소드가 정의되어 있다.			
		*/
		
		//1. 문자열의 길이 (length())
		String str1="Hello World :)";		 //14자
		String str2="안녕하세요! 반갑습니다. :)"; //16자	<==다른 언어는 한글을 2,3byte로 체킹하지만 java는 1바이트로 체킹
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("-----------------------------------");
		
		//2. 문자열 검색 (charAt(), indexOf(), lastIndexOf())
		// 2-1. charAt() : 해당 index (방번호)의 문자를 가져옴.
		
		System.out.println(str1.charAt(0));		//H
		System.out.println(str1.charAt(10));	//d
		System.out.println(str1.charAt(12));	//:
		
		System.out.println(str2.charAt(0));		//안
		System.out.println(str2.charAt(10));	//니
		System.out.println(str2.charAt(12));	//.
		System.out.println("----------------------------------");
		
		// 2-2. indexOf() : 해당 글자에 대한 방 번호를 출력, 왼쪽(처음) ==> 오른쪽(끝)
		//		lastIndexOf() : 해당 글자에 대한 방 번호를 출력, 오른쪽(끝) ==> 왼쪽(처음)
	
		System.out.println(str1.indexOf('o'));		//4번방 	o문자의 방번호
		System.out.println(str1.lastIndexOf('o'));	//7번방 	o문자의 방번호
		//o문자를 6번방 이후에서부터 검색
		System.out.println(str1.indexOf('o',6));		//7번방
		System.out.println(str1.lastIndexOf('o',6));	//4번방
		//"World" 문자열의 방번호를 찾음
		System.out.println("----------------------------------");
		System.out.println(str1.indexOf("World"));		//6
		System.out.println(str1.lastIndexOf("World"));	//6
		
		System.out.println(str2.indexOf("하세요"));		//2
		
		//없는 내용을 검색 시 -1 (방에 값이 없다. 존재하지 않는다 라는 뜻)
		System.out.println("----------------------------------");
		System.out.println(str1.indexOf("bye"));		//-1
		
		System.out.println(str2.indexOf("고마워요"));		//-1
		
		System.out.println(str2.indexOf("반갑습니다"));	//7
		
		//3. 문자열 변환 및 연결(String.valueOf(), concat())
		String str3= String.valueOf(2.3);	//double ==> String
		String str4= String.valueOf(false); //boolean ==> String
		
		System.out.println(str3);
		System.out.println(str4);
		
		String str5= str3.concat(str4);		// +와 같음
		System.out.println(str5);
		
		//4. 문자열 ==> byte[] ( getBytes()), 문자열 => char[] (toCharArray())
	
		String str8="Hello java!";
		String str9="안녕하세요";
		
		byte[]arr1=str8.getBytes();		// 영문인 경우 각 글자의 아스키 코드로 배열에 저장
		byte[]arr2=str9.getBytes();		// 영문인 경우 각 글자의 아스키 코드로 배열에 저장
		
		System.out.println(Arrays.toString(arr1));		// 각 문자의 아스키 코드로 출력
		System.out.println(Arrays.toString(arr2));		//문자를 숫자코드로 변환

		System.out.println("----------------------------------------");
		
		// 문자열을 char[]배열에 저장
		char[]arr3= str8.toCharArray();
		char[]arr4= str9.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
	}

}
