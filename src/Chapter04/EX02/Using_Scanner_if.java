package Chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 국어aa, 영어bb, 수학cc, 과학dd, 음악ee 점수를 정수값으로 인풋 받습니다. 
		//if문을 사용해서 평균이 90점 이상 "A학점", 80점 이상 "B학점", 70점 이상 "C학점", 60점 이상 "D학점" 
		//그렇지 않을 시 "F학점"

		Scanner sc=new Scanner(System.in);

		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 넣으세요>>>");
		
		
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		int cc=sc.nextInt();
		int dd=sc.nextInt();
		int ee=sc.nextInt();
		
		double avg = (aa+bb+cc+dd+ee)/5.0;
		System.out.println("평균 점수 "+avg+"입니다.");
		
		if (avg>=90) {
			System.out.println("A학점");
		}else if(avg>=80) {
			System.out.println("B학점");
		}else if(avg>=70) {
			System.out.println("C학점");
		}else if(avg>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		
		
		sc.close();
		
		
		
	}

}
