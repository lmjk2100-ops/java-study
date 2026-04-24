package javastart;

public class Var1 {
	public static void main(String[] args) {
		int a = 100; //정수(4바이트)
		long l = 1000000000L; //정수(8바이트), 값에 L붙임
		float f = 10.5f; //실수(4바이트), 값에 f붙임
		double b = 10.5; //실수(8바이트), 기본적으로 실수는 더블로 잡힘
		boolean c = true; //true, false 소문자로 쓴다.
		//블리언(boolean) true, false 입력 가능, 1바이트
		//참 또는 거짓을 숫자로 표현 안하고 단어로 표현(영어)
		char d = 'A'; //문자 하나 문자 하나가 2바이트
		String e = "Hello Java";
		//문자열, 문자열을 다루기 위한 특별한 타입 
		//앞글자는 *대문자 S(타입이 아니라 클래스라서 대문자를 앞에 쓴다)
		
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a+"\n"+l+"\n"+f+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
		System.out.printf("%d %d %.1f %.1f %b %c %s", a, l, f, b, c, d, e);
	}

}
