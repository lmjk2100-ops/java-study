package javastart;

class Circle{
	int radius;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
}

public class Array1 {
	public static void main(String[] args) { //실행
		//Circle c = new Circle();
		Circle[] c;
		c = new Circle[5]; // 5개의 방(데이터가 없는 빈방)
		
		for (int i= 0 ; i < c.length ; i++) {
			c[i] = new Circle(i);
		}
		
		for(int a= 0 ; a < c.length ; a++) {
			System.out.println(c[a].getArea());
			
		}
		
		
		
		
	}
}
