package ch7;

class AA {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class BB implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class CC implements I {
	public void play() {
		System.out.println("play in C class");
	}
}

class InterfaceTest2 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.autoPlay(new BB()); // void autoPlay(I i) call
		aa.autoPlay(new CC()); // void autoPlay(I i) call
	}

}