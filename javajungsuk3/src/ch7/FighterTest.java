package ch7;

class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit)
			System.out.println("f는 Unit클래스의 손자");

		if (f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스 구현");

		if (f instanceof Movable)
			System.out.println("f는 Movable인터페이스 구현");
		if (f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스 구현");
		if (f instanceof Object)
			System.out.println("f는 Object클래스의 손자");

	}

}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {

	}

	public void attack(Unit u) {

	}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {

}

interface Movable {

}

interface Attackable {

}