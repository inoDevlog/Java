package ch7;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tvv extends Product {
	Tvv() {
		super(100);
	}

	public String toString() {
		return "Tvv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("ÀÜ¾×ºÎÁ·");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "»ò¾î");
	}
}

class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tvv());
		b.buy(new Computer());

		System.out.println(b.money);
		System.out.println(b.bonusPoint);
	}

}
