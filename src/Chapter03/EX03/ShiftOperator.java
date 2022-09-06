package Chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
		//산술 시프트 ( <<, >> )
		//    부호 비트는 고정되어 있다.
		//    대량의 계산을 빠르게 처리할 수 있다.
		
		
		// <<    각 비트를 왼쪽으로 이동 
		// 정수 3을 2진수 변환 후 왼쪽으로 1비트 이동
		// 이동 후 비어있는 비트는 MSB(부호비트)로 채움 
		System.out.println(3<<1);	//3*2^1 = 6
		System.out.println(3 << 2); //3*2^2 = 12
		System.out.println(3 << 3); //3*2^3 = 24

		System.out.println(-3 << 1);
		
		// >>    각 비트를 오른쪽으로 이동 
		// 0 이하로 떨어지지 않음, 일정 수 이후 계속 0
		
		System.out.println(5 >> 1);
		System.out.println(5 >> 2);
		
		//논리 시프트 (>>>)
		System.out.println(3>>>1);
		
		
		
		
		
		

	}

}
