package javastart;

class Student{ //클래스(설계도) 생성
	//클래스 = 멤버변수(필드)(속성) + 메서드(기능 또는 행위) 구성
	String name; //멤버변수
	int score;	 //멤버변수
	
	//생성자(construtor) : 객체 생성할때 값을 부여
	Student(String n, int s){ //생성자(클래스 이름과 동일)
		name = n;
		score = s;
	}
	
	//메서드 정의
	void printInfo(){
		System.out.println(name+","+score);
	}
}

public class Main { //실행하는 클래스
	

	public static void main(String[] args)//main method
	{
		Student s1 = new Student("홍길동", 90); //객체(인스턴스) 생성줄
		Student s2 = new Student("이순신", 100);
		//Student() : 클래스(설계도, 내가 만들었음)
		//new : 객체 생성 연산자
		//s1 : 참조변수(주소를 기억), 객체 생성
		//Student 타입(자료형)을 말한다 => Student객체를 가르킴
		
		//s1.name = "홍길동"; //'.'(점)은 멤버 접근 연산자
		//s1.score = 90;
		s1.printInfo(); //메서드 호출
		
		//s2.name = "이순신";
		//s2.score = 100;
		s2.printInfo();
		
		System.out.println("이름은: "+s1.name);
		System.out.println("정수는: "+s1.score);
		System.out.println("이름은: "+s2.name);
		System.out.println("정수는: "+s2.score);
		
		
		
		
		
	}

}

