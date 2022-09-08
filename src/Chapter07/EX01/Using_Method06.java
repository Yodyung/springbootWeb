package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {
	
	static int add (int[]a) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int b=0;
		for(int i=0; i<a.length; i++) {
			b+=a[i];
		}
		return b;
	}
	
	static int div (int[]a) {
		//들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int d=7;	//초기 값이 0이면 0-7부터 시작하므로 7로 설정해주어야 함
		for(int i=0; i<a.length; i++) {
			if(i==0) {continue;};		//i==0 일때는 아래 내용을 실행하지 말고 위로 다시 돌아감
			d-=a[i];			// d=d-a[i]
		}
		
		return d;
	}
	
	static long mul (int[]a) {
		//들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		// 곱할때는 초기값을 1로 설정. 0을 넣으면 아무리 곱해도 0이 나온다.
		long m=1;
		for(int i=0; i<a.length; i++) {
			m*=a[i];
		}
		return m;
	}
	
	static double avg (int[]a) {
		//들어온 배열의 모든 값의 평균을 구해서 평균 값을 리턴
		int aa=0;
		double avg=0;
		for(int i=0; i<a.length; i++) {
			aa+=a[i];
			avg=aa/(double)a.length; //a.length가 결국 count++로 센 수와 같기 때문 굳이 count 변수 안만들어도 됨
		}
		return avg;
	}
	

	public static void main(String[] args) {
		// 1-100까지 7의 배수만 저장 후 각 메소드 호출
		
		int []arr=new int[14];
		// int []arr-new int[100/7];	배열의 방의 갯수 지정
		
		for(int i=0, j=7; i<arr.length; i++, j+=7) {
				arr[i]=j;
			}
			
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		int add=add(arr);
		System.out.println("더하기 : "+add);
		
		int div=div(arr);						//변수명과 메소드 명은 같아도 사용법이 다르기 때문에 괜찮음.
		System.out.println("빼기 : "+div);
		
		long mul=mul(arr);						//int 범위를 넘는다. ==> long
		System.out.println("곱하기 : "+mul);		// long으로 하지 않으면 제대로 된 값이 나오지 않음
		
		double avg=avg(arr);
		System.out.println("평균 : "+avg);
		
		
		

	}

}
