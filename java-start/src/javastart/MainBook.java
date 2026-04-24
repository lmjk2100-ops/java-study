package javastart;

class Book{ //클래스(설계도) 생성
	//클래스 = 멤버변수(필드)(속성) + 메서드(기능 또는 행위) 구성
	String title; //멤버변수
	int price;	 //멤버변수
	
	//생성자 오버로딩
	Book(String i, int j){ //생성자, 객체생성시 인자 2개
		title = i;
		price = j;
	}
	
	Book(String i){ //객체생성시 인자 1개
		title = i;
		price = 0;
	}
	
	Book(){ //객체생생시 인자 0개
		title = "C언어 정석";
		price = 0;
	}
	//메서드 정의
	void showPrice(){
		System.out.println("도서제목:"+title+","+"가격:"+price);
	}
}

public class MainBook {
		
		public static void main(String[] args)//main method
		{
			Book myBook = new Book("자바의 정석", 20000); //객체(인스턴스) 생성줄
			//Student() : 클래스(설계도, 내가 만들었음)
			//new : 객체 생성 연산자
			//s1 : 참조변수(주소를 기억), 객체 생성
			//Student 타입(자료형)을 말한다 => Student객체를 가르킴
			
			Book myBook2 = new Book("파이썬 정석");
			Book myBook3 = new Book();
			
			//myBook.title = "자바의 정석"; //'.'(점)은 멤버 접근 연산자
			//myBook.price = 20000;
			myBook.showPrice(); //메서드 호출
			myBook2.showPrice();
			myBook3.showPrice();
			//System.out.println("도서 제목: "+myBook.title);
			//System.out.println("가격: "+myBook.price);
	}
			
}
