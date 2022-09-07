package Chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D {

	public static void main(String[] args) {
		//2차원 배열을 출력
		
		int[][]arr1=new int[][] {{1,2,3,4,5},{6,7},{8,9,10},{11,12}};
		
		//직접 출력
		System.out.print(arr1[0][0]+" "+arr1[0][1]+" "+arr1[0][2]+" "+arr1[0][3]+" "+arr1[0][4]+" ");
		System.out.print(arr1[1][0]+" "+arr1[1][1]+" ");
		System.out.print(arr1[2][0]+" "+arr1[2][1]+" "+arr1[2][2]+" ");
		System.out.print(arr1[3][0]+" "+arr1[3][1]+" ");
		System.out.println();
		System.out.println(arr1.length);		//<===행의 개수
		System.out.println(arr1[0].length);		//<===0행의 열의 개수
		System.out.println(arr1[1].length);		//<===1행의 열의 개수
		System.out.println(arr1[2].length);		//<===2행의 열의 개수
		System.out.println(arr1[3].length);		//<===3행의 열의 개수
		
		
		
		//for문을 사용해서 출력
		for(int i=0; i<arr1.length; i++) {			//i: 행의 index번호
			for(int j=0; j<arr1[i].length; j++) {	//j: 열의 index번호
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//향상된 for문으로 출력
		for(int []h:arr1) {
			for(int g:h) {
				System.out.print(g+" ");
			}
		}
		System.out.println();
		System.out.println("=================================================");
		
		
		//
		String[][] arr7= new String[][] {{"홍길동","예사랑","예소은"},
			{"말티즈","요크셔테리어","푸들","미니핀"},{"오복이","복돌이","두부"},
			{"여소현","황세리","김건희"}
			};
		String[] arr8=new String[] {"사람 이름 : ","동물 이름 : ","개의 종류 : ","친구 이름 : "};	
			
			//출력 : 가족 이름 : 홍길동 이순신 세종대왕
			//		동물 이름 : 어쩌구 저쩌구
			//		개의 종류 : 어쩌구 저쩌구
			//		친구 이름 : 어쩌고 저쩌고
			
			System.out.println("============================================");
			//1. for문으로 출력
			System.out.println("for문으로 출력");
			for(int i=0; i<arr7.length; i++) {
				System.out.print(arr8[i]);
				for(int j=0; j<arr7[i].length; j++) {
					if(i==0) {
						System.out.print(arr7[i][j]+" ");
					}else if(i==1) {
						System.out.print(arr7[i][j]+" ");
					}else if(i==2) {
						System.out.print(arr7[i][j]+" ");
					}else if(i==3) {
						System.out.print(arr7[i][j]+" ");
					}
				}
				
				System.out.println();
			}
			System.out.println("============================================");
			//2. 향상된 for문으로 출력
			for(String[]f : arr7) {
				System.out.print("이름 : ");
				for(String s:f) {
					System.out.print(s+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("============================================");
			System.out.println();
			//3. arrays.tostring()로 출력
			for(int i=0; i<arr7.length; i++) {
				System.out.print(arr8[i]);
				System.out.println(Arrays.toString(arr7[i]));
			}
			System.out.println();
			
			
			//선생님 답변
			System.out.println("==========================for문===========================");
			for(int i=0; i<arr7.length; i++) {
				if(i==0) {System.out.print("사람 이름 : ");}	// for문이 돌아가기 전에 제목 조건 달아놓기
				if(i==1) {System.out.print("멈무 종류 : ");}	// 그럼 1번만 표시 되고 끝남
				if(i==2) {System.out.print("멈무 이름 : ");}
				if(i==3) {System.out.print("친구 이름 : ");}
				for(int j=0; j<arr7[i].length; j++) {
					System.out.print(arr7[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("=========================향상된for문========================");
			for(String []a:arr7) {
				if(a.equals("홍길동")) {System.out.print("사람 이름 : ");}
				if(a.equals("말티즈")) {System.out.print("멈무 종류 : ");}
				if(a.equals("오복이")) {System.out.print("멈무 이름 : ");}
				if(a.equals("여소현")) {System.out.print("친구 이름 : ");}
				for(String b:a) {
					System.out.print(b+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("=======================Arrays.toString=====================");
			for(int i=0; i<arr7.length; i++) {
				if(i==0) {System.out.print("사람 이름 : ");}	// for문이 돌아가서 출력되기 전 제목 달기
				if(i==1) {System.out.print("멈무 종류 : ");}	// 그럼 1번만 표시 되고 끝남
				if(i==2) {System.out.print("멈무 이름 : ");}
				if(i==3) {System.out.print("친구 이름 : ");}
				System.out.println(Arrays.toString(arr7[i]));
			}
			 

	}

}
