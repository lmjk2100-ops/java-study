package pack2;

import pack1.Parent;

public class Child extends Parent{
	
	
	public static void main(String[] args) { //설계도의 메서드는 호출해야
		System.out.println("=== 자식 클래스 접근 ===");
		//System.out.println("public a = " + a); 
		//System.out.println("protected b = " + b);
		//System.out.println("default c = " + c); //동일 패키지만 default는 가능한데다른 패키임
		//System.out.println("privatr d = " + d); //다른 패키지임 동일 클래스도 아님
	} 
	

}
