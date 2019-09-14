package ch6;

class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.sub(5L, 3L);
		long result3 = mm.mul(5L, 3L);
		double result4 = mm.div(5L, 3L);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("sub(5L, 3L) = " + result2);
		System.out.println("mul(5L, 3L) = " + result3);
		System.out.println("div(5L, 3L) = " + result4);

	}
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}

	long sub(long a, long b) {
		long result = a - b;
		return result;
	}

	long mul(long a, long b) {
		long result = a * b;
		return result;
	}

	double div(double a, double b) {
		double result = a / b;
		return result;
	}
}