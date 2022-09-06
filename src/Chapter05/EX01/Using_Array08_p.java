package Chapter05.EX01;

import java.util.Scanner;

public class Using_Array08_p {

	public static void main(String[] args) {
				//정수 배열 방 10개를 생성하고 임의의 값을 10개의 방에 저장
			 	//그 중 최대 값 최소 값을 뽑아서 출력하는 프로그램을 생성
				//출력 : 배열방 10개에서 최대값은 : 000
				//스캐너로 인풋받아 임의의 정수 10개 등록
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		int min=0;
		int max=0;
		
		System.out.println("10개의 정수를 입력하세요.");

		for(int i=0; i<arr.length; i++) {	//스캐너로 인풋받아 몇번 입력 받을지를 설정하기.
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("정수의 최대 값은 "+max);
		
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("정수의 최소 값은 "+min);

		sc.close();
	}

}
