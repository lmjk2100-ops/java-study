package javastart;

public class Var2 {
	public static void main(String[] args) {
		final double PA = 3.14; //final 불변
		double res1 = PA * 10;
		System.out.println(res1);
		
		
		//var : 자동적으로 변수의 타입(형) 정정
		var x = 5;
		System.out.println(x++ + ++x);
		
		//왼쪽x: 5 -> x++해서 6 -> ++x 7 => 5 + 7 = 12
		System.out.println(2*1500+300+"	hello");
		var k = 30.5;
		var y=12.3f;
		var n = "java";
		System.out.println(x +" " + k + " " + y + " " + n);
	}
		
}
