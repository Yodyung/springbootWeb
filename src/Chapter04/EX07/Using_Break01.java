package Chapter04.EX07;


public class Using_Break01 {

	public static void main(String[] args) {
		// break; <== 해당 구문 -{}- 을 탈출할 때 사용
		//	-1단계만 탈출(해당 군락만 탈출)
		// for, while, do while(반복문을 탈출할 때 사용)

		// # 1.단일 loop에서 탈출
		for(int i=0; i<10; i++) {
			System.out.println(i);
			//break;		//1단계 탈출
		}
		System.out.println("------------------------------------");
		
		//break는 for, while, do while내에서 if 조건문과 같이 사용 
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {break;} //1단계 탈출, i가 5일때 탈출
		} 
		
		System.out.println("------------------------------------");
		
		// # 2.다중 loop에서 break 사용
		//case1. 하나의 loop문만 탈출
		
		for(int i=0; i<5; i++) {	//0-4 : 5번 loop
			for(int j=0; j<5; j++) { //0-4 : 5번 loop
				if(j==2) {break;}
				System.out.println(i+","+j);		//하나의 for문만 탈출
			}

		}
		
		System.out.println("------------------------------------");
		
		//case2. 한꺼번에 탈출 (바깥쪽 for문의 변수의 값을 조건이 false가 나도록 증가시켜서 탈출)
		
		for(int i=0; i<5; i++) {	//0-4 : 5번 loop
			for(int j=0; j<5; j++) { //0-4 : 5번 loop
				if(j==2) {
					i= 100;			//바깥쪽의 for문의 변수값을 증가시켜서 한꺼번에 탈출
					break;}
				System.out.println(i+","+j);		//하나의 for문만 탈출
			}

		}
		
		System.out.println("------------------------------------");
		
		//case2. 한꺼번에 탈출 (label을 사용해서 탈출)
		

		jump: for(int i=0; i<5; i++) {	//0-4 : 5번 loop jump: <==":"중요!
			for(int j=0; j<5; j++) { //0-4 : 5번 loop
				if(j==2) {	
					break jump;}		//jump는 변수의 라벨, 따라서 이름 바꿔도 상관없음
				System.out.println(i+","+j);		
			}

		}
		
		
		
		
	}

}
