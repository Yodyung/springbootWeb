package Chapter02.Ex04;

public class DataType {

	public static void main(String[] args) {
		/*
		 자바의 자료형
		 - 기본 자료형 8가지 : 첫자가 소문자
		 	=boolean : true, false
		 	=byte	 : 정수(1btye=8bit), -2^7~ + 2^7-1
		 						  		-128~+127
		 	=int	 : 정수(4btye=32bit)
		 				-2^31~ + 2^31-1
		 				-거의 99% 사용
		 	=short	 : 정수(2btye=16bit)
		 				-2^15~ +2^15-1(-1은 0때문에)
		 				-32768~+32767
		 	=long	 : 정수(8btye=64bit), 값을 할당할 때 1234>L< 삽입
		 				-2^63 ~ +2^63-1
		 	-float	 : 실수(4btye), 값을 할당할 때 1234.45>F< 삽입
		 	=double	 : 실수(8btye)	<=실수 기본값
		 	=char	 : 문자 1글자, ''
		 	
		 	>char, String 이외는 따옴표 넣으면 안됨
		 	
		 - 참조 자료형 무한대 : 첫자가 대문자(권고) <String은 참조 자료형이다.>
		 		- String : 문자열(하나 아니고 여러개), ""
		 		배열, 클래스/인터페이스
		 */
		
		boolean bbong;	// true, false 만!
		bbong= true;
		System.out.println(bbong);
		
		byte bbb;		//정수 값만 할당 가능 , 1byte= 8bit
		bbb= -128;		// -128 ~ +127 값만 할당 가능.
		System.out.println(bbb);
		
		byte bb;
		byte cc;
		//bb= 128;		//byte 범위를 넘겨서 입력 오류 앞에(byte) 붙혀주면 오류나지 않음
		bb=(byte)128;	//-128
		cc=(byte)129;	//-127
		System.out.println("bb의 출력값" + bb);
		System.out.println("cc의 출력값" + cc);

		short ccc;		// -32768~+32767까지
		ccc = -32767;
		ccc = (short)32767;
		System.out.println(ccc);
		System.out.println("abc 변수의 출력값"+ ccc);
		
		short abc;
		abc=32767;	//short 변수의 마지막
		abc=(short)32768;	
		
		int ddd;
		ddd=1234567890;
		System.out.println(ddd);
		
		long eee;				//값을 넣을 때 L을 붙여 삽입해야함
		eee=123456789123456789L;
				
		

	}

}
