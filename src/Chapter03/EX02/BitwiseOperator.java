package Chapter03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
		//bit 연산
		//자바 메소드를 사용해서 진법변환 (2진수, 8진수, 16진수)
		int data =13;
		
		
		
		
		//Integer 객체의 함수를 사용 (총 32bit, 4byte, int)
		// -- toBinaryString(입력값) : 10진수 => 2진수 
		
		System.out.println(Integer.toBinaryString(data));	//정수를 2진수로 출력
		System.out.println(Integer.toOctalString(data));	//정수를 8진수로 출력
		System.out.println(Integer.toHexString(data));		//정수를 16진수로 출력
	
		System.out.println("==================");
		
		// 2진수, 8진수, 16진수의 값을 10진수로 변환
		System.out.println(Integer.parseInt("1101",2)); 	//2진수를 10진수로 변환
		System.out.println(Integer.parseInt("15",8));		//8진수를 10진수로 변환
		System.out.println(Integer.parseInt("d",16));		//16진수를 10진수로 변환
		System.out.println("==================");
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);	//0b는 2진수
		System.out.println(015);	//0은 8진수
		System.out.println(0xd);	//0x는 16진수
		
		//비트연산자 And : &  <== 하나의 비트에 0이 존재하면 무조건 0
		System.out.println("==================");
		System.out.println(3&10);			//10진수
		System.out.println(0b0011&0b1010);	//2진수
		System.out.println(0x03&0x0A);		//16진수
		
		System.out.println("==================");
		
		
		//비트연산자 Or : |  <== 하나의 비트에 1이 존재하면 무조건 1
		System.out.println(3|10);				//11
		System.out.println(0b0011|0b1010);		//11
		System.out.println(0x03|0x0A);			//11
		System.out.println("==================");
		
		
		//비트연산자 XOR : ^  <== 두 비트가 동일할 경우 0, 다를 경우 1
		System.out.println(3^10);			//9
		System.out.println(0b0011^0b1010);	//9
		System.out.println(0x03^0x0A);		//9
		System.out.println("==================");
		
		
		//비트연산자 NOT : ~  <== 0일때 1, 1일때 0 항상 -된 후 +1이 된 숫자가 값으로 나온다.
				System.out.println(~3);			//-4
				System.out.println(~0b0011);	//-4
				System.out.println(~0x03);		//-4
				
				System.out.println(~100);
				System.out.println("==================");

				//192.168.100.100    ip adress (32bit)
				//255.255.255.0       subnet Mask
				//=====================AND 연산
				
				System.out.printf("%d.%d.%d.%d\n",192&255,168&255,100&255,100&000);

				
				
			int abc = 123;		//10진수
			int bcd = 0123;		//앞에 0이오면 8진수
			int efg = 0x123;	//16진수
			
			
			System.out.println("==================");
			System.out.println(abc);
			System.out.println(bcd);
			System.out.println(efg);
			
				
				
				
				
				
		
		
		
		
		

	}

}
