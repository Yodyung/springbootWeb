package Chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		//4학년의 경우 70점 이상이면 합격, 미만이면 불합격 중첩 if문 사용 (if내에 if문)
		//30분까지
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학년과 점수를 순서대로 입력하세요. >>>");
		
		int year=sc.nextInt();
		int score=sc.nextInt();
		
		System.out.println("당신은 "+year+"학년 입니다.");
		System.out.println("당신의 점수는"+score+"점 입니다.");
		
		if(year==4) {
			if(score>=70) {
			System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else{
			if(score>=60) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
				
		}
		
		
		sc.close();
		
		/*선생님 답지
		 System.out.println("점수를 입력하세요(0~100)");
		 int score = sc.nextInt();
		 System.out.println("학년을 입력하세요(1~4));
		 int year = sc.nextInt();
		 
		 if (score>=60) {
		 	if(year!=4) {
		 		System.out.println("합격입니다.");	4학년 아니면 60점 이상 합격
		 	}else if(score>=70) {
		 		System.out.println("합격입니다.");	4학년이고 70점 이상 합격
		 	}else {
		 		System.out.println("불합격입니다."); 4학년이고 70점 이상이 아니면 불합격
		 	}
		 	
		 }else {
		 	System.out.println("불합격입니다.");	60점 미만이면 모든 학년 불합격
		 }
		 	
		 sc.close();
		 
		 */
		
		
		
		
		
		
		
	
	
	}
}
	
