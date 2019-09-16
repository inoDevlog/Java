package ch6;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args) Start");
		firstMethod();
		System.out.println("main(String[] args) End");
	}

	static void firstMethod() {
		System.out.println("firstMethod() Start");
		secondMethod();
		System.out.println("firstMethod() End");
	}

	static void secondMethod() {
		System.out.println("secondMethod() Start");
		System.out.println("secondMethod() End");
	}

}