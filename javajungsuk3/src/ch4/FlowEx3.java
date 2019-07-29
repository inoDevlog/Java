package ch4;

import java.util.Scanner;

public class FlowEx3 {
	public static void main(String[] args) {
		System.out.println("insert #");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if (input == 0) {
			System.out.println("0");
		} else {
			System.out.println("not 0");
		}
	}

}
