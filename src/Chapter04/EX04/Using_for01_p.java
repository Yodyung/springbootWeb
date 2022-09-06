package Chapter04.EX04;

public class Using_for01_p {
	public static void main(String[] args) {
		//for문을 사용해서 0~1000까지 7의배수의 합계
				//7의 배수의 합계 : 
		int sum=0;
		int seven=0;
		int total=0;
		
		for(seven=0,sum=0; seven<=1000; seven+=7) {
			sum+=seven;
		}
		System.out.println("7의 배수의 합계 : "+sum);	// for문 안쪽에 쓸 시 숫자가 반복될 때마다 나옴
				
		//for문과 (for문 안에)if문을 사용해서 1~10까지 더한 값을 출력하되 아래와 같이 출력하세요.
				// 결과 : 1+2+3+4+5+6+7+8+9+10=55 print로
		for(total=1, sum=0; total<=10; total++) {
			sum+=total;
			if(total<10) {
				System.out.print(total+"+");
			}else {
				System.out.print(total+"="+sum);
			}
		}
		System.out.println();
		//for문과 (for문 안에)if문을 사용해서 11~55까지 더한 값을 출력하되 아래와 같이 출력하세요.
				// 결과 : 11+12...55= print로
		for(total=11, sum=0; total<=55; total++) {
			sum+=total;
			if(total<55) {
				System.out.print(total+"+");
			}else {
				System.out.print(total+"="+sum);
			}
		}
		
		
	}

}
