package Chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지로 출력
		
		String[] s=new String[5];
		
		s[0]="예사랑";
		s[1]="광개토대왕";
		s[2]="신사임당";
		s[3]="단군";
		s[4]="이순신";
		
		System.out.println("-------------직접출력--------------");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
		System.out.println("------------for---------------");
		for(int a=0; a<5; a++) {
			System.out.println(s[a]);
		}
		
		System.out.println("-------------향상된 for--------------");
		for(String f : s) {
			System.out.println(f);
		}
		System.out.println("-------------어레이--------------");
		System.out.println(Arrays.toString(s));
	}

}
