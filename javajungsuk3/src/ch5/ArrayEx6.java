package ch5;

public class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = { 80, 90, 100, 56, 70, 80, 76 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);

	}

}
