package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array {

	public static void main(String[] args) {
		//기본 자료형인 경우 : RAM 에 stack 영역에 변수와 값이 같이 저장됨
		//참조 자료형인 경우 : RAM 에 stack 영역에 변수명이 저장이 되고 heap 영역에 변수의 값이 저장이 됨
		
		//배열 (Array) : 하나의 [배열] 변수에 여러개의 값을 할당.
		//	--1. 동일한 자료형의 값을 할당
		//	--2. [배열]의 방 크기를 지정하면 수정이 불가능.
		
		 
		//배열 변수 a를 선언
		int[]a=new int[5];		//배열 a 변수의 방의 크기 5개 생성 후 주소값을 a에 할당해라.
		//a = 참조변수 (참조 주소값을 가지고 있다.)
		//방번호 [index]0~4방까지 5개 생성 후 값을 a에 한참 
		//new : heap 영역에 배열 방 5개를 생성해서 heap영역의 번지를 a변수에 할당해라. 
		
		
		//계열분수의 값을 할당
		a[0] =10;	//heap영역에 index 0방에 정수 0을 넣어라.
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
	
		//배열 방의 값을 출력
		
		//배열 index를 사용하여 값을 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//for문을 이용해서 출력
		System.out.println("------------for문을 사용해서 배열방의 담을 값 출력-----------------");
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("배열변수 a의 방 갯수 : "+a.length);		//배열 방의 총 갯수를 출력

		System.out.println("---for문에서 a.length를 사용해서 출력---");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(a);		//heap 메모리의 주소
		System.out.println("--------------------------------------");
		
		//향상된(Enhanced) for문으로 배열의 모든 값을 출력
		//배열의 모든 방을 순환하면서 출력함.
		//배열의 모든 값을 한꺼번에 출력함.
		System.out.println("=========향상된 for문을 사용해서 출력========");
		for(int k:a) {
			System.out.print(k+" ");
		} 

		System.out.println();
		
		//Array.toString(a) 로 출력
		System.out.println("=================Array.toString=================");
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("==================================");
		
		
		
		
	}

	
	
	
	
	
}
