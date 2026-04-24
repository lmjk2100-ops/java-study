package accessex;

class Sample {
	public int a;
	private int b;
	int c;
	
	void va() {
		System.out.println(a+b+c);
	}
}


public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; //b변수는 클래스가 sample라서 클래스가 다르므로 오류가 생김
		sample.c = 10;
		
		
		sample.va();
	}
}
