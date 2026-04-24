package javaex;

public class Main {
	public static void main(String[] args) {
		System.out.println("초기 정보");
		Employee e = new Employee("홍길동",201,3500000);
		e.print();
		//이름을 이순신 수정
		// 사번을 205 로 수정
		//급여는 5000000로 수정
		System.out.println("수정 정보");
		// 전체 값을 수정
		//이름을 이순신으로 수정
		e.setName("이순신");
		//사번을 205로 수정
		e.setNo(205);
		e.setPay(5000000);
		
		e.print();
		
	}
}
