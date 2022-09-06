package Chapter03.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		//논리 연산자 (&&<=and, ||<=or, ^<=xor, !<=not)
		//좌측과 우측에는 반드시 true 나 false가 와야함
		// AND 연산 : && 양 쪽 모두 true일때 true
		
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false&& false);	//false
		System.out.println(true && (5<3));	//false
		System.out.println((5<=5) && (7>2));//true
		System.out.println("================");
		
		//OR 연산 : || 좌우 중 하나만 true 면 true
		System.out.println(true||true);		//t
		System.out.println(true||false);	//t
		System.out.println(false||false);	//f
		System.out.println((9>7)||(7>9));	//t
		System.out.println((3>3)||(4>4));	//f
		System.out.println("================");
		
		//XOR 연산 : ^ 좌우 가 동일할 때 false, 다를 때 true
		System.out.println(true^false);
		System.out.println(false^false);
		System.out.println((3>3)^(3>=3));
		System.out.println("================");
		
		//NOT 연산 : ! 반대로 출력. false면 true, true면 false
		System.out.println(!true);	//f
		System.out.println(!false);	//t
		System.out.println(false|| !(5<=5));//f
		System.out.println(true|| !(3==3));//t
		System.out.println("================");
		
		//비트연산자로 논리 연산을 수행
		System.out.println(true&true);	//t
		System.out.println(true&false);	//f
		System.out.println(true|(5<3));	//t
		System.out.println((5<=5)|(7>2));//t
		System.out.println("================");
		
		//숏 서킷 (short circuit) : 
		// -왼쪽의 결과 값만으로 유추할 수 있는 오른쪽의 값을 실행하지 않는 것.
		// -논리 연산자에서만 작동한다(&&, ||, ^, !), 비트연산자에서는 작동되지 않음.(&, |, ^, ~)
		
		
		//AND 연산에서 숏 서킷이 발생되는 예제
		//논리연산에서는 short circuit이 발생됨
		
		int value1 =3;
		System.out.println(false&& ++value1>6);	//short circuit &&앞이 false이기 때문에 앞의 값만으로도 뒤의값 필요 없어짐
												//true가 와야 뒤의 연산이 작동하여 값이 변동함
		System.out.println(value1);
		
		//비트연산에서는 short circuit 발생되지 않음
		
		int value2 =3;
		System.out.println(false&++value2>6); //오른쪽 왼쪽 모두 확인
		System.out.println(value2);
		System.out.println("================");
		
		
		//OR 연산에서 숏 서킷이 발생되는 예제
		int value3 =3;
		System.out.println(true||++value3>6);	//short circuit ||앞이 true이기 때문에 앞의 값만으로도 뒤의값 필요 없어짐
												//false가 와야 뒤의 연산이 작동하여 값이 변동함
		System.out.println(value3);
		
		//비트연산에서는 short circuit 발생되지 않음
		
		int value4=3;
		System.out.println(true|++value4>6);
		System.out.println(value4);
		
		
	}

}
