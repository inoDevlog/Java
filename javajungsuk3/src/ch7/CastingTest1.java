package ch7;

class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;
		// car.water();
		fe2 = (FireEngine) car;
		fe2.water();
	}
}

class Car {
	String color;
	int doir;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}