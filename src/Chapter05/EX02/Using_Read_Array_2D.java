package Chapter05.EX02;

import java.util.Arrays;

public class Using_Read_Array_2D {

	public static void main(String[] args) {
		// 2차원 배열의 값을 읽기
			// 1차원 배열일 때 : arr.length <==열(세로)의 개수	/ 1차원 배열은 행이 없음
			// 2차원 배열일 때 : arr.length <==행(가로)의 개수
			// 2차원 배열일 때 : arr[i].length <==열(세로)의 개수 / i는 행의 번호
		
		int[] arr0= new int[100];
		System.out.println(arr0.length);	// 1차원 배열, 열(방) 100개 생성
		
		
		
		//1. 2차원 배열의 길이 (정방형 배열)
		int[][] arr=new int[3][4];
		System.out.println(arr.length);		// <== 행의 개수 
		System.out.println(arr[0].length);	// <== 0행의 열의 개수
		System.out.println(arr[1].length);	// <== 1행의 열의 개수
		System.out.println(arr[2].length);	// <== 2행의 열의 개수
		System.out.println("=====================");
		
		//2. 2차원 배열의 길이 (비정방형 배열)
		int[][]arr2=new int[][] {{1,2},{3,4,5,6}};
		
		System.out.println(arr2.length);	// <== 행의 개수
		System.out.println(arr2[0].length); // <== 0행의 열의 개수
		System.out.println(arr2[1].length); // <== 1행의 열의 개수
		System.out.println("=====================");
		
		// 2차원 배열 출력 방법
		
		//1. 방법1 - 방 번호를 직접 출력
		System.out.print(arr2[0][0]+" "+arr2[0][1]+" ");
		System.out.println();
		System.out.print(arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]+" ");
		System.out.println();
		System.out.println("=====================");
		
		//2. 방법2 - for문을 사용해서 출력 : 2차원 배열 이중 for(for문 내의 for문)
			//바깥쪽 for문 : arr.length : 행의 갯수
			//안쪽 for문 : arr[i].length : 해당 행의 열 갯수
		for(int i=0; i<arr2.length; i++) {		//행의 개수를 1씩 증가
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");	// i:행의 방번호, j:열의 방번호
			}
			System.out.println();	//한 행이 끝나면 엔터 적용
		}
		
		//3. 방법3 - enhanced for문을 사용해서 출력 : 이중 for문을 사용해서 출력
		System.out.println("=====향상된 for문으로 출력=====");
		for(int[]a:arr2) {		//arr2 2차원 배열을 1차원 배열로 꺼낸다. 
			for(int b:a) {		//a 일차원 배열의 각 방의 값을 b 변수로 꺼낸다.
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
		//4. 방법4 - Arrays.toString() <=== 1차원 배열의 값을 출력
		for (int i=0; i<arr.length; i++) {			//4번 루프
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}

}
