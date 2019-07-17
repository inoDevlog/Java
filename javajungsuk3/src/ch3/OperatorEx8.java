package ch3;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // a*b가 이미 int의 값
		
		System.out.println(c);
	}

}
