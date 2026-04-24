package pack1;

public class ParentTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		
			System.out.println("=== 같은 패키지 테스트 ===");
			System.out.println("public a = " + p.a); 
			//public은 공용이라는 뜻을 가지고 있다 즉 다른 클래스 다른 클래스라도 사용 할 수 있음
			System.out.println("protected b = " + p.b); //같은 클래스에서만 가능한데 상속 받으면 오케이
			System.out.println("default c = " + p.c); //같은 패키지라면 ok
			//System.out.println("private d = " + p.d); 
			//같은 클래스가 아니라서 불가능
			System.out.println("\n=== 메서드 호출 ===");
			p.show();
		}
		
}
