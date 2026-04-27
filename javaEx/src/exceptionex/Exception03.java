package exceptionex;

public class Exception03 {
	public static void main(String[] args) {
		try {
			
			int[] a= {1,2};
			System.out.println(a[5]);//에러
			
			String str =null;
			System.out.println(str.length());//에러
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어남");
		}
		catch (NullPointerException e) {
			System.out.println("null 레퍼런스 참조 예외");
		}
		catch (Exception e) { //Exception : 모든 예외일때, 항상 마지막
			System.out.println("null 레퍼런스 참조 에러");
		}
	}
}
