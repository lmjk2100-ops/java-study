package ex1;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		
//		System.out.println("부모 멤버 사용");
		d.name = "뽀삐";
		d.age = 2;
		d.color = "검정"; //객체 d의 변수 color는 갈색
		
		System.out.println(d.name+","+d.age+","+d.color);
		
		d.eat(); //부모
		d.sleep(); //부모
		//d.show();
		// 자식 클래스 메서드 호출
		d.bark(); //자식
		d.run(); //짓;ㄱ
	}
}
