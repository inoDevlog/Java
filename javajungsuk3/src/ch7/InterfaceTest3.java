package ch7;

class InterfaceTest3 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.methodA();
	}
}

class AAA {
	void methodA() {
		II ii = InstanceManager.getInstance();
		ii.methodB();
		System.out.println(ii.toString()); // i로 Object클래스의 메서드 호출 가능
	}
}

interface II {
	public abstract void methodB();

}

class BBB implements II {
	public void methodB() {
		System.out.println("methodB in B class");
	}

	public String toString() {
		return "class B";
	}
}

class InstanceManager {
	public static II getInstance() {
		return new BBB();
	}
}