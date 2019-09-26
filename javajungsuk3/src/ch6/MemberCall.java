package ch6;

class MemberCall {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;

	static void staticMethod() {
		System.out.println(cv);
		// System.out.println(iv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}

	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {
		staticMethod();
		// instanceMethod();
		MemberCall c = new MemberCall();
		c.instanceMethod();

	}

	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

}
