package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(" x: " + x + " y: " + y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println(" x: " + x + " y: " + y);
		
		float pi = 3.14f;
	}
}