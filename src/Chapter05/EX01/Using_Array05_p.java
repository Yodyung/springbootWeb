package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array05_p {

	public static void main(String[] args) {
		// 1~500까지 3의 배수를 배열에 저장
		// 출력 : 1.직접출력 2.for문 출력 3.향상된 for문 출력 4.toString() 출력
		// 합계 : , 평균 :

		int ba[]=new int[170];
		int sum=0;
		int count=0;
		
		for(int i=0, j=3; i<ba.length; i++, j+=3) {
			if(j<=500) {
				ba[i]=j;
				count++;
				sum+=j;
			}
			
		}
		
		
		System.out.println("----직접 출력----");
		System.out.println(ba[0]);
		
		System.out.println("----for 출력----");
		for(int i=0; i<ba.length; i++) {
			System.out.println(ba[i]);
		}
		
		System.out.println("총 3의 배수 갯수 : "+count);
		
		System.out.println("----향상된 for 출력----");
		for(int h:ba) {
			System.out.println(h);
		}
		
		System.out.println("----to string 출력----");
		System.out.println(Arrays.toString(ba));
	
		//합계 구하기
		
		System.out.println("합계는 "+sum+" 평균은 "+sum/(double)count);
		
		
		
		
		
		
		
		
	}

}
