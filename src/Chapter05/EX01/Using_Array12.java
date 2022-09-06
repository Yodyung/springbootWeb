package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		// 1~1000까지 배열(arr)에 저장 후 
		//1. 배열 선언 
		//2. [입력] for문을 사용해서 arr 배열 변수에 값을 할당
		//3. [출력] for문을 통해서 arr 변수의 값 출력
		//4. [출력] 향상된 for문을 통해서 arr 변수의 값 출력
		//5. [출력] arrays.toString(arr) 출력

		int []arr=new int[1000];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;	// = 붙으면 무 조 건 오른쪽이 왼쪽에 대입!
						// int i=1이 아닌 0인 이유는 배열 0번방부터 입력해야 하기 때문
						// 그리고 1부터 출력이 시작이기 때문에 밑의 arr[i]=i에 +1을 해주어 1부터 시작하게 함
		}
		System.out.println("========================================");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("========================================");
		
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("========================================");
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
