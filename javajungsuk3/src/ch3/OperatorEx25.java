package ch3;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("text plz");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0'<= ch && ch <= '9') {
			System.out.printf("ur text is number");
		}
		if(('a'<= ch && ch <= 'z' || 'A'<=ch && ch <= 'Z')) {
			System.out.println("ur text is ch");
		}
	}

}
