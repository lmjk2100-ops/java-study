package staticex;

//static 변수는 "클래스가 메모리에 로딩될 때" 생성
//모든 객체가 공유
//객체 없이 사용 가능(클래스 이름으로 접근)
//한 번만 생성됨(끝까지)

class Counter2{
	
	static int cnt = 0; //static 변수(클래스 변수)
	//객체마다 있는게 아니라 클래스 하나에 딱 한 개만 존재함
	//모든 곳에서 공유됨
	//static 변수 정수 cnt에 값은 0이다.
	
	static void increase() {
		//객체 생성 없이 사용 가능
		//클래스 이름(여기선 지금 Counter)으로 바로 호출 가능
		cnt++; //cnt 값을 1씩 증가 (후위계산)
	}
}



public class StaticTest2 {
	public static void main(String[] args) {
		//객체 생성이 없음
	
		
		Counter2.increase(); //클래스 이름으로 직접 호출함 (한 번 호출이니 0 -> 1, cnt = 1)
		Counter2.increase(); //클래스 이름으로 직접 호출함 (두 번쨰 호출이니 1 -> 2, cnt = 2)
		
		System.out.println("count: " + Counter2.cnt); //변수도 클래스 이름으로 호출 (count: 2)
	}
}
