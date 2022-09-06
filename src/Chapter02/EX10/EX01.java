package Chapter02.EX10;

public class EX01 {
	
	public static void main(String[] args) {
		
		//각 변수의 평균값을 계산 하세요.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd = 75.5;
		double ee = 60.3;

		int data1 = (aa + bb + cc)/3;
		double data2 = (dd + ee)/2;
		
		double data3 = (double)(data1 + data2)/2; //계산 오류
		double data4 = (double)(aa+bb+cc+dd+ee)/5;
		double data5 = (aa+bb+cc+dd+ee)/5.0;
	
		
		System.out.println("각 과목의 평균 값은 : " + data1);
		System.out.printf("각 과목의 평균 값은 : %f" , data2
				);
		System.out.println();
		System.out.println("각 과목의 평균 값은" + data3);
		System.out.println("각 과목의 평균 값은" + data4);
		System.out.println("각 과목의 평균 값은" + data5);
		System.out.printf("각 과목의 평균 값은 : %4.2f",data2);
		
		//선생님 답변
		double avg = (aa+bb+cc+dd+ee)/5.0;
		System.out.println("각 과목의 평균 값은 : " + avg);
		System.out.printf("각 과목의 평균 값은 : %4.2f",avg);
		
	
		
		
		
	}

}
