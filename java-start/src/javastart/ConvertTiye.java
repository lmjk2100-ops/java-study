package javastart;

import java.util.Scanner; //Scanner
//import ctrl+shift+o
public class ConvertTiye {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //키보드로 입력위해	
		//import java.util.Scanner
		
	//문자열 입력
		System.out.println("숫자를 문자로 입력하세요: ");
			String input = scanner.nextLine(); //nextLine()는 문자열 1줄
	//문자열 -> 숫자 변환		
		double d = Double.parseDouble(input); //a(문자) -> num(정수)
		//Integer(정수) : Wrapper class(래퍼클래스)
		//기본형을 객체로 갑싸는 클래스
		//Integer.parseInt(a) : 문자 -> 정수 변환
	//숫자 -> 문자열
		String s1 = Double.toString(d);
		String s2 = String.valueOf(d);
		
	//출력
		System.out.println("입력 문자열 : " + input);
		System.out.println("숫자로 변환 : " + d);
		System.out.println("다시 문자열로 변환(toString) : " + s1);
		System.out.println("다시 문자열로 변환(valueOf) : " + s2);

		scanner.close();
		
	}

}
