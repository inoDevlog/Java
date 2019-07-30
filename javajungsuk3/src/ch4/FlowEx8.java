package ch4;

import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.println("당신의 주빈번호를 입력하세요. (000000-1111111)----->");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();

		char gender = regNo.charAt(7);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("Man");
			break;
		case '2':
		case '4':
			System.out.println("Woman");
			break;
		default:
			System.out.println("n val");
		}

	}

}
