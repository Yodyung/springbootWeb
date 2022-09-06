package Chapter04.EX02_prac;

import java.util.Scanner;

public class Using_Scanner_if06_3 {

	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
				//4학년의 경우 70점 이상이면 합격, 미만이면 불합격 중첩 if문 사용 (if내에 if문)
				
		Scanner sc=new Scanner(System.in);
		
		System.out.println("당신의 학년을 입력하십시오.");
		int y=sc.nextInt();
		
		System.out.println("당신의 성적을 입력하십시오.");
		int s=sc.nextInt();
		
		System.out.printf("당신은 %d학년, 성적은 %d점 입니다.",y,s);
		
		if(s>=60) {
			if(y!=4) {
				System.out.println("합격입니다.");
			}else if(s>=70) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
		

	}

}
