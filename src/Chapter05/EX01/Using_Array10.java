package Chapter05.EX01;

import java.util.Scanner;

public class Using_Array10 {

	public static void main(String[] args) {
		
		//국어 80 영어 50 수학 77 과학 88 인풋		<==전체 라인을 인풋 받아서 공백을 기준으로 잘라서 배열에 저장
		//스캐너로 인풋받아 Line 으로 인풋받기 
		//공백으로 나누고 정수값으로 계산해서 합계 평균 과목 수 계산하기
		
		//국어 80 영어 50 수학 77 과학 88 인풋		<==전체 라인을 인풋 받아서 공백을 기준으로 잘라서 배열에 저장 
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("과목 명과 점수의 공백을 구분해서 넣으세요.");
				String s=sc.nextLine(); 
				
				//공백을 기준으로 데이터를 잘라서 배열에 저장
				String[]arr;	//배열 선언
				arr=s.split(" ");	//공백을 기준으로 잘라서 arr배열 안에 저장
				
				//arr배열의 전체를 출력
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");		//string
				}
				System.out.println();
				
				// 배열의 홀수방의 값을 가지고 와서 (정수) 값을 가져와서 합과 평균을 구한다.
				int b;		//과목의 점수를 담는 변수
				int sum=0;	//합을 구하는 변수
				int count=0;
				for(int i=0; i<arr.length; i++) {
					if(i%2!=0) {	//홀수 방의 값만 가져온다.
						b=Integer.parseInt(arr[i]);		//홀수방의 값만 b변수에 저장
						sum+=b;
						count++;
					}
				}
				System.out.println("과목의 합 : "+sum);
				System.out.println("과목의 평균 : "+sum/(double)count);
		
		
		
		/*
		System.out.println("계산하고 싶은 과목과 점수를 차례대로 띄어쓰기하며 넣어주세요.");
		
		String s;
		s=sc.nextLine();	//입력값 한줄로 받기 먼저 설정해두고
		
		String[] arr;
		arr=s.split(" ");	// 그 다음 공백으로 나눠서 배열에 저장해두기
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int b;
		int sum=0;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {				// 홀수값만 골라서 평균 내기 설정!!! 까먹지 말기!!!
			b=Integer.parseInt(arr[i]);
			sum+=b;
			count++;
				
			}
			
		}
		System.out.println("총 과목의 수는 "+count);
		System.out.println("총 과목의 합계는 "+sum);
		System.out.println("총 과목의 평균은 "+sum/(double)count);
		*/
		sc.close();		
	}

}
