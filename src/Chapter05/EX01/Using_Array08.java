package Chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		//정수 배열 방 10개를 생성하고 임의의 값을 10개의 방에 저장
		//그 중 최대 값 최소 값을 뽑아서 출력하는 프로그램을 생성
		//출력 : 배열방 10개에서 최대값은 : 000
		//스캐너로 인풋받아 임의의 정수 10개 등록
		 
		Scanner sc=new Scanner(System.in);

		int arr[]=new int[10];
		int max=0;	//최대값을 저장하는 변수 선언
		int min=0;	//최소값을 저장하는 변수 선언
		
		System.out.println("정수 10개를 입력하시오.");
		
		//스캐너로 임의의 정수값 입력
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//최대값을 뽑아서 max 변수에 저장 후 출력
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {		//arr의 i번째 방의 값이 max변수의 값보다 크면
				max=arr[i];			//max변수에 arr[i]번 방의 값을 max 변수에 대입
			}
		}
		
		System.out.println("배열방 10개서의 최대값은 :"+max);
		
		//최소값을 뽑아서 min변수에 저장 후 출력
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("배열방 10개서의 최소값은 :"+min);
		System.out.println("--------------2.Arrays.sort()메소드를 사용해서 출력------------------");
		
		// case.2
		Arrays.sort(arr);	//배열 방의 값을 정렬을 한다. 0(최소값), 1, 2, 3, 4....arr.length-1(최대값)
		System.out.println("최대값 : "+arr[arr.length-1]);
		System.out.println("최소값 : "+arr[0]);
		
		//case.3
		System.out.println("--------------3.stream을 사용해서 출력------------------");
		System.out.println("최대값 : "+Arrays.stream(arr).max().getAsInt());
		System.out.println("최소값 : "+Arrays.stream(arr).min().getAsInt());
		
		
		sc.close();
	}

}
