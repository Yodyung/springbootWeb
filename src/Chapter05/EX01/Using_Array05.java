package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1~500까지 3의 배수를 배열에 저장
		// 출력 : 1.직접출력 2.for문 출력 3.향상된 for문 출력 4.toString() 출력
		// 합계 : , 평균 :
		
		int sum=0;
		int count=0;
		int i=0;
		int[] num;
		
		for(i=1; i<=500; i++) {
			if(i%3==0) {
				count++;
			}
		}
		
		num= new int[count];
		int index=0;
		
		for(i=1; i<=500; i++) {
			if(i%3==0) {
				sum+=i;
				num[index]=i;
				index++;
			}
		}
		
		System.out.println();
		
		System.out.println("----직접 출력----");
		System.out.printf(num[0]+"\t");
		System.out.println();
		
		System.out.println("----for 출력----");
		for(int a=1; a<num.length; a++) {
			System.out.print(num[a]+" ");
		}
		
		System.out.println();
		System.out.println("----향상된 for 출력----");
		for(int k:num) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("----to string 출력----");
		System.out.println(Arrays.toString(num));
		
		
		System.out.println("3의 배수의 총 합은"+sum+" 평균은"+sum/(double)count+"입니다.");
		
	}

	/*
	 선생님 답지
	 
	 선언
	 
	 int[] arr = new int[500];
	 
	 1.배열에 3의 배수 저장
	 
	 int count=0;	//3의 배수 갯수
	 for(int i=0, j=3; i<arr.length; i++, j+=3) {
	 	if(J<=500) {
	 	arr[i]=j;
	 	count++
	 	}
	 }
	 
	System.out.println("----직접 출력----");
 	System.out.println(arr[0]);
 			
	System.out.println("----for 출력----");
	for(int a=0; a<arr.length; a++) {
		System.out.print(arr[a]+" ");
	}
	
	System.out.println("총 3의 배수 갯수 : "+count);
		
	System.out.println();
	System.out.println("----향상된 for 출력----");
	for(int k:arr) {
		System.out.print(k+" ");
	}
	System.out.println();
	System.out.println("----to string 출력----");
	System.out.println(Arrays.toString(arr));
	
	합계 구하기
	int sum=0;
	for(int a=0; a<arr.length; a++) {
		sum+=arr[a];
	}
	System.out.println("합계 : "+sum);
	System.out.println("평균 : "+sum/(double)count);
	 
	 
	 */
	
	
	
}
