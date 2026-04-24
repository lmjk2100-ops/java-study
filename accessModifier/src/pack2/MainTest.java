package pack2;

import pack1.Parent; //public클래스는 어느곳에서나 객체 생성이 가능하다.
					 //하지만 다른 채키지일 경우는 import를 해애함.

public class MainTest {

	public static void main(String[] args) {
		
		Parent pa = new Parent(); //Parent는 다른 클래스라서 오류가 생김
		Child ch = new Child();
		
		System.out.println("public a = " + pa.a);
		//System.out.println("protected b = " + pa.b);
		//System.out.println("default c = " + pa.c);
		//System.out.println("private d = " + pa.d);
		
		//자식클래스 접근
		//ch.printChild(); //Child는 다른 패키지라서 오류가 뜸
	}

}
