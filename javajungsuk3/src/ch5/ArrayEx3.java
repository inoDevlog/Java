package ch5;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;

		System.out.println("[º¯°æÀü]");
		System.out.println("arr.length:" + arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]:" + arr[i]);

	}

}
