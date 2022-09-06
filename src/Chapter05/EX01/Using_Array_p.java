package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array_p {

	public static void main(String[] args) {
		//
		
		int arr[]=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//배열 index를 사용하여 값을 출력
		System.out.println(arr[0]);
		System.out.println("-----------------------------");
		//for문을 이용해서 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------");
		//향상된(Enhanced) for문으로 배열의 모든 값을 출력
		for(double g:arr) {
			System.out.println(g);
		}
		
		System.out.println("-----------------------------");
		//Array.toString(a) 로 출력
		System.out.println(Arrays.toString(arr));
		
		//1. 배열 선언 및 초기화
			//index 0~5 방을 만들어라.
			//heap영역에 double 방 6개를 생성 후 주소 값을 d 변수에 할당해라.
		int arrr[]=new int[6];
		
		//2. 배열의 값을 할당
		arrr[0]=100;
		arrr[1]=200;
		arrr[2]=300;
		arrr[3]=400;
		arrr[4]=500;
		arrr[5]=600;
		
		//3. 배열 방의 값을 출력
		
		//3-1. 직접 출력
		System.out.println(arrr[0]);
		System.out.println(arrr[1]);
		System.out.println(arrr[2]);
		System.out.println(arrr[3]);
		System.out.println(arrr[4]);
		System.out.println(arrr[5]);
		
		System.out.println("------------3-2.for문을 사용해 출력-----------");
		//배열 방의 갯수 : 6
		for(int i=0; i<arrr.length-2; i++) {
			System.out.println(arrr[i]);
			//i<d.length=방의 갯수보다 작을때까지
			}
		//for문을 사용하면 원하는 방의 값만 출력 할 수 있다. 
	
		System.out.println("------------3-3. 향상된 for문을 사용해 출력-----------");
		for(int kk:arrr) {
			System.out.println(kk);
		}
		
		System.out.println("------3-4. Arrays.toString(d) 사용해 출력------");
		System.out.println(Arrays.toString(arrr));
		
		
		
		
		
		
		
	}

}
