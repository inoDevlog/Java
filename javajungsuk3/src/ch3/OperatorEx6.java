package ch3;

public class OperatorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = a++;
		byte c = (byte) (a + b);

		System.out.println(c);
		System.out.println(a);
	}

}
