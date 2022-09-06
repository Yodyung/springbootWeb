package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array03_p {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지로 출력
		
		
		
		String we[]=new String[5];
		
		we[0]="예사랑";
		we[1]="예소은";
		we[2]="오선현";
		we[3]="오희수";
		we[4]="김건희";
		
		System.out.println("-------------직접출력--------------");
		System.out.println(we[0]);
		System.out.println(we[1]);
		System.out.println(we[2]);
		System.out.println(we[3]);
		
		System.out.println("-------------포--------------");
		for(int i=0; i<we.length; i++) {
			System.out.println(we[i]);
		}
		
		System.out.println("-------------향상포--------------");
		for(String a:we) {
			System.out.println(a);
		}
		
		System.out.println("-------------어레이--------------");
		System.out.println(Arrays.toString(we));
	}

}
