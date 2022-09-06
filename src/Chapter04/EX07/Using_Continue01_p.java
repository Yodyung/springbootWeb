package Chapter04.EX07;

public class Using_Continue01_p {

	public static void main(String[] args) {
		//for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3의배수만 출력하세요.
		
		for(int i=1; i<=1000; i++) {
			if(i%3!=0) {continue;}
			System.out.print(i+" ");
		}
		System.out.println();
		//for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 5의배수만 출력하세요.
		for(int i=1; i<=1000; i++) {
			if(i%5!=0) {continue;}
			System.out.print(i+" ");
		}
		
		System.out.println();
		//for문을 사용해서 1에서 1000까지 1씩 증가하고 if를 사용해서 3,5,7의배수만 출력하세요.
		for(int i=1; i<=1000; i++) {
			if((i%3==0)||(i%5==0)||(i%7==0)) {
				System.out.print(i+" ");
			}
		}
	}

}
