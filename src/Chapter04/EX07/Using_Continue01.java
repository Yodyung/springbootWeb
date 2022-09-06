package Chapter04.EX07;

public class Using_Continue01 {

	public static void main(String[] args) {
		// Continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복, 마침표같은 의미.
		// - 단독으로 쓰이는 경우는 거의 없음. if문과 함께 쓰인다.
		
		//1.단일 loop에서 continue
		for(int i=0; i<10; i++) {	//0-9까지 10번 
			System.out.println("A");
			continue;					//continue 아래의 코드는 실행하지 않음, 구문 안에서 빠져나가지 않음.
			//System.out.println("B");	//도달할 수 없는 코드
		} 

		 
		for(int i=0; i<10; i++) {	//0-9까지 10번 
			System.out.println("A");
			if(i%2==0) {continue;} 	//continue 아래의 코드는 실행하지 않음, 단락 안에서 빠져나가지 않음
									//i가 0,2,4,6,8일때만 작동함
			System.out.println("B");
		}

		System.out.println("------------------------------------------");
		for(int i=0; i<10; i++) {
			if(i==5||i==7) {continue;}		//5,7 일때 continue만나서 올라감
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		
		//for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3의배수만 출력하세요.
		System.out.println("------------------------------------------");
		for(int i=1; i<=1000; i++) {
			if(i%3!=0) {continue;}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 5의배수만 출력하세요.
		System.out.println("------------------------------------------");
		for(int i=1; i<=1000; i++) {
			if(i%5!=0) {continue;}
			System.out.print(i+" ");
		}		
		
		System.out.println();
		
		//for문을 사용해서 1에서 1000까지 1씩 증가하고 if를 사용해서 3,5,7의배수만 출력하세요.
		System.out.println("------------------------------------------");
		for(int i=1; i<=1000; i++) {
			if((i%3==0)||(i%5==0)||(i%7==0))
			System.out.print(i+" ");			
		}
		
		//2. 다중 loop에서 continue
		System.out.println();
		System.out.println("------------------------------------------");
		for(int i=0; i<5; i++) {		//5번
			for(int k=0; k<5; k++) {	//5번
				if(k==3) {continue;}
				System.out.println(i+" , "+k);
			}
		}
		
		System.out.println("---------------label을 사용해 점프------------------");
		out:for(int i=0; i<5; i++) {		//5번
			for(int k=0; k<5; k++) {	//5번
				if(k==3) {continue out;}
				System.out.println(i+" , "+k);
			}
		}
		
		System.out.println("------------------------------------------");
		out:for(int i=0; i<5; i++) {		//5번
			for(int k=0; k<5; k++) {	//5번
				if(k==3) {
					i=10;		//바깥쪽 for문의 변수값을 증대 시켜서 false로 빠져나옴.
					continue out;}
				System.out.println(i+" , "+k);
			}
		}
		
		
		
	}

}
